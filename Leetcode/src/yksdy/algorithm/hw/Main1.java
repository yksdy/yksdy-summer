package yksdy.algorithm.hw;

import java.util.Scanner;
import java.util.Stack;

public class Main1 {
    static Stack<Character> stack = new Stack<Character>();
    static Stack<Double> stackDouble = new Stack<Double>();
    static String flag1 = "-+";
    static String flag2 = "*/";
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            help(in.next());
        }
    }
    
    public static void help(String temp) {
        boolean b = false;
        for (int i = 0; i < temp.length(); i++) {
            char c = temp.charAt(i);
            if (flag1.indexOf(c) >= 0) {
                if (stackDouble.isEmpty()) {
                    stackDouble.add((double) 0);
                    stack.add(c);
                } else {
                    stack.add(c);
                }
                
            } else if (flag2.indexOf(c) >= 0) {
                stack.add(c);
                b = true;
            } else {
                if (b) {
                    double d1 = stackDouble.pop();
                    double d2 = (double) (c - '0');
                    char cc = stack.pop();
                    if (cc == '*') {
                        stackDouble.add(d1 * d2);
                    } else {
                        stackDouble.add(d1 / d2);
                        
                    }
                    b = false;
                } else {
                    stackDouble.add((double) (c - '0'));
                }
            }
        }
//        System.out.println("stack=" + stack);
//        System.out.println("stackDouble=" + stackDouble);
        while (!stack.isEmpty()) {
            double d1 = stackDouble.pop();
            double d2 = stackDouble.pop();
            char cc = stack.pop();
            if (cc == '+') {
                stackDouble.add(d1 + d2);
            } else {
                stackDouble.add(d2 - d1);
                
            }
        }
        String result = stackDouble.pop().toString();
//        System.out.println(result);
        String ssru = result.substring(0, result.indexOf("."));
//        System.out.println(result.substring(0, result.indexOf(".")));
        
        System.out.println(ssru);
    }
}