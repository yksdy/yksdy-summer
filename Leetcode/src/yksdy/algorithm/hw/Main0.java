package yksdy.algorithm.hw;

import java.util.Scanner;
import java.util.Stack;

public class Main0 {
    static Stack<Character> stack = new Stack<Character>();
    static Stack<Integer> stackDouble = new Stack<Integer>();
    static String flag1 = "-+";
    static String flag2 = "*/";
    static String flag3 = "-+*/";
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            help(in.next());
        }
    }
    
    public static void help(String temp) {
        boolean b = false;
        boolean bx = false;
        String mzy = "";
        for (int i = 0; i < temp.length(); i++) {
            char c = temp.charAt(i);
            
            if (flag1.indexOf(c) >= 0) {
                if (!"".equals(mzy)) {
                    stackDouble.add(Integer.parseInt(mzy));
                }
                if (stackDouble.isEmpty()) {
                    stackDouble.add(0);
                    stack.add(c);
                } else {
                    stack.add(c);
                }
                
                bx = true;
            } else if (flag2.indexOf(c) >= 0) {
                if (!"".equals(mzy)) {
                    stackDouble.add(Integer.parseInt(mzy));
                }
                stack.add(c);
                b = true;
                bx = true;
            } else {
                if (!bx) {
                    
                    mzy += c;
                } else {
                    
                    if (b) {
                        int d1 = stackDouble.pop();
                        int d2 = Integer.parseInt(mzy);
                        char cc = stack.pop();
                        if (cc == '*') {
                            stackDouble.add(d1 * d2);
                        } else {
                            stackDouble.add(d1 / d2);
                            
                        }
                        b = false;
                    } else {
                        stackDouble.add(Integer.parseInt(mzy));
                    }
                    System.out.println("mzy = " + mzy);
                    mzy = "";
                    bx = false;
                }
            }
            
        }
        System.out.println("stack=" + stack);
        System.out.println("stackDouble=" + stackDouble);
        while (!stack.isEmpty()) {
            int d1 = stackDouble.pop();
            int d2 = stackDouble.pop();
            char cc = stack.pop();
            if (cc == '+') {
                stackDouble.add(d1 + d2);
            } else {
                stackDouble.add(d2 - d1);
                
            }
        }
        System.out.println(stackDouble.pop());
    }
}
