package yksdy.algorithm.hw;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Main4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            help(scan.next());
        }
    }
    
    public static void help(String str) {
        List<Integer> listInt = new ArrayList<Integer>();
        List<Character> listChar = new ArrayList<Character>();
        String oldstr = str;
        String s = str.replace("-", "$");
        s = s.replace("+", "$");
        s = s.replace("/", "$");
        s = s.replace("*", "$");
        if (oldstr.startsWith("-")) {
            listInt.add(0);
        }
        System.out.println("s = " + s);
        String[] arrs = s.split("\\$");
        for (String arr : arrs) {
            System.out.println("arr = " + arr);
            if (!"".equals(arr)) {
                listInt.add(Integer.parseInt(arr));
                
            }
        }
        
        String temp = "-+*/";
        for (int i = 0; i < oldstr.length(); i++) {
            char c = oldstr.charAt(i);
            if (temp.indexOf(c) >= 0) {
                listChar.add(c);
            }
        }
        
        Stack<Integer> stackInt = new Stack<Integer>();
        Stack<Character> stackChar = new Stack<Character>();
        String mult = "*/";
        System.out.println("listInt=" + listInt);
        System.out.println("listChar=" + listChar);
        int j = 0;
        for (int i = 0; i < listChar.size(); i++) {
            System.out.println("j=" + j);
            stackInt.add(listInt.get(j++));
            if (mult.indexOf(listChar.get(i)) >= 0) {
                int a = stackInt.pop();
                int b = listInt.get(j++);
                System.out.println("a=" + a);
                System.out.println("b=" + b);
                System.out.println("listChar.get(i)=" + listChar.get(i));
                if (listChar.get(i) == '*') {
                    stackInt.add(a * b);
                } else {
                    stackInt.add(a / b);
                    
                }
                System.out.println("stackInt=" + stackInt);
            } else {
//                stackInt.add(listInt.get(j++));
                stackChar.add(listChar.get(i));
            }
        }
        Stack<Integer> stackInt1 = new Stack<Integer>();
        Stack<Character> stackChar1 = new Stack<Character>();
        
        while (!stackInt.isEmpty()) {
            stackInt1.add(stackInt.pop());
            
        }
        while (!stackChar.isEmpty()) {
            stackChar1.add(stackChar.pop());
            
        }
        while (!stackChar.isEmpty()) {
            char c = stackChar1.pop();
            int a = stackInt1.pop();
            int b = stackInt1.pop();
            System.out.println("@a=" + a);
            System.out.println("@b=" + b);
            if (c == '+') {
                stackInt1.add(a + b);
            } else {
                stackInt1.add(b - a);
                
            }
        }
        System.out.println(stackInt1.pop());
        
    }
}
