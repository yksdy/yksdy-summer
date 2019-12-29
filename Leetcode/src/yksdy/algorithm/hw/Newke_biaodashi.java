package yksdy.algorithm.hw;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Newke_biaodashi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String biaodashi = scan.next();
        int x = 0;
        try {
            
            x = helpHaveSomeSign(biaodashi);
        } catch (Exception e) {
            System.out.println(biaodashi);
            e.printStackTrace();
            
        }
        System.out.println(x);
    }
    
    public static int helpHaveSomeSign(String exp) {
        if (exp.indexOf("(") >= 0) {
            int start = -1;
            int end = -1;
            for (int i = 0; i < exp.length(); i++) {
                if (exp.charAt(i) == '(') {
                    start = i;
                }
                if (exp.charAt(i) == ')') {
                    end = i;
                    break;
                }
            }
            
            String midexp = exp.substring(start + 1, end);
            String startecp = exp.substring(0, start);
            String endecp = "";
            if ((exp.length() - 1) > end) {
                endecp = exp.substring(end + 1);
            }
            String jiajian = "+-";
            int x = helpHaveSomeSign(midexp);
            if (x < 0 && !startecp.equals("")) {
                x = 0 - x;
                int fg = 0;
                for (int z = startecp.length() - 1; z >= 0; z--) {
                    if (fg == 0 && (startecp.charAt(z) == '+')) {
                        startecp = startecp.substring(0, z) + "-" + startecp.substring(z + 1, startecp.length());
                        break;
                    } else if (fg == 0 && (startecp.charAt(z) == '-')) {
                        startecp = startecp.substring(0, z) + "+" + startecp.substring(z + 1, startecp.length());
                        break;
                    } else if (startecp.charAt(z) == ')') {
                        fg++;
                    } else
                    
                    if (startecp.charAt(z) == '(') {
                        fg--;
                    }
                }
            }
            
            return helpHaveSomeSign(startecp + x + endecp);
        }
        if (exp.indexOf("[") >= 0) {
            int start = -1;
            int end = -1;
            for (int i = 0; i < exp.length(); i++) {
                if (exp.charAt(i) == '[') {
                    start = i;
                }
                if (exp.charAt(i) == ']') {
                    end = i;
                    break;
                }
            }
            
            String midexp = exp.substring(start + 1, end);
            String startecp = exp.substring(0, start);
            String endecp = "";
            if ((exp.length() - 1) > end) {
                endecp = exp.substring(end + 1);
            }
            String jiajian = "+-";
            int x = helpHaveSomeSign(midexp);
            if (x < 0 && !startecp.equals("")) {
                x = 0 - x;
                int fg = 0;
                for (int z = startecp.length() - 1; z >= 0; z--) {
                    if (fg == 0 && (startecp.charAt(z) == '+')) {
                        startecp = startecp.substring(0, z) + "-" + startecp.substring(z + 1, startecp.length());
                        break;
                    } else if (fg == 0 && (startecp.charAt(z) == '-')) {
                        startecp = startecp.substring(0, z) + "+" + startecp.substring(z + 1, startecp.length());
                        break;
                    } else if (startecp.charAt(z) == ']') {
                        fg++;
                    } else
                    
                    if (startecp.charAt(z) == '[') {
                        fg--;
                    }
                }
            }
            
            return helpHaveSomeSign(startecp + x + endecp);
        }
        if (exp.indexOf("{") >= 0) {
            int start = -1;
            int end = -1;
            for (int i = 0; i < exp.length(); i++) {
                if (exp.charAt(i) == '{') {
                    start = i;
                }
                if (exp.charAt(i) == '}') {
                    end = i;
                    break;
                }
            }
            
            String midexp = exp.substring(start + 1, end);
            String startecp = exp.substring(0, start);
            String endecp = "";
            if ((exp.length() - 1) > end) {
                endecp = exp.substring(end + 1);
            }
            String jiajian = "+-";
            int x = helpHaveSomeSign(midexp);
            if (x < 0 && !startecp.equals("")) {
                x = 0 - x;
                int fg = 0;
                for (int z = startecp.length() - 1; z >= 0; z--) {
                    if (fg == 0 && (startecp.charAt(z) == '+')) {
                        startecp = startecp.substring(0, z) + "-" + startecp.substring(z + 1, startecp.length());
                        break;
                    } else if (fg == 0 && (startecp.charAt(z) == '-')) {
                        startecp = startecp.substring(0, z) + "+" + startecp.substring(z + 1, startecp.length());
                        break;
                    } else if (startecp.charAt(z) == '}') {
                        fg++;
                    } else
                    
                    if (startecp.charAt(z) == '{') {
                        fg--;
                    }
                }
            }
            
            return helpHaveSomeSign(startecp + x + endecp);
        }
        return help(exp);
    }
    
    public static int helpHaveSign(String exp) {
        
        if (exp.indexOf("(") >= 0) {
            int start = -1;
            int end = -1;
            for (int i = 0; i < exp.length(); i++) {
                if (exp.charAt(i) == '(') {
                    start = i;
                }
                if (exp.charAt(i) == ')') {
                    end = i;
                    break;
                }
            }
            
            String midexp = exp.substring(start + 1, end);
            String startecp = exp.substring(0, start);
            String endecp = "";
            if ((exp.length() - 1) > end) {
                endecp = exp.substring(end + 1);
            }
            String jiajian = "+-";
            int x = helpHaveSign(midexp);
            if (x < 0 && !startecp.equals("")) {
                x = 0 - x;
                int fg = 0;
                for (int z = startecp.length() - 1; z >= 0; z--) {
                    if (fg == 0 && (startecp.charAt(z) == '+')) {
                        startecp = startecp.substring(0, z) + "-" + startecp.substring(z + 1, startecp.length());
                        break;
                    } else if (fg == 0 && (startecp.charAt(z) == '-')) {
                        startecp = startecp.substring(0, z) + "+" + startecp.substring(z + 1, startecp.length());
                        break;
                    } else if (startecp.charAt(z) == ')') {
                        fg++;
                    } else
                    
                    if (startecp.charAt(z) == '(') {
                        fg--;
                    }
                }
            }
            
            return helpHaveSign(startecp + x + endecp);
        }
        return help(exp);
        
    }
    
    public static int help(String strExpression) {
        if (strExpression.startsWith("-")) {
            strExpression = "0" + strExpression;
        }
        String strExp = strExpression;
        strExp = strExp.replace("-", "#");
        strExp = strExp.replace("+", "#");
        strExp = strExp.replace("*", "#");
        strExp = strExp.replace("/", "#");
        
        String[] arrs = strExp.split("#");
        List<Integer> listInt = new ArrayList<Integer>();
        for (String arr : arrs) {
            if (!"".equals(arr)) {
                listInt.add(Integer.parseInt(arr));
                
            }
        }
        
        String temp = "-+*/";
        List<Character> listChar = new ArrayList<Character>();
        for (int i = 0; i < strExpression.length(); i++) {
            char c = strExpression.charAt(i);
            if (temp.indexOf(c) >= 0) {
                listChar.add(c);
            }
        }
        return helpHandlMultDiv(listInt, listChar);
        
    }
    
    public static int helpHandlMultDiv(List<Integer> listInt, List<Character> listChar) {
        Stack<Integer> stackInt = new Stack<Integer>();
        Stack<Character> stackChar = new Stack<Character>();
        
        String mult = "*/";
        stackInt.add(listInt.get(0));
        for (int i = 0; i < listChar.size(); i++) {
            
            if (mult.indexOf(listChar.get(i)) >= 0) {
                int a = stackInt.pop();
                int b = listInt.get(i + 1);
                if (listChar.get(i) == '*') {
                    stackInt.add(a * b);
                } else {
                    stackInt.add(a / b);
                    
                }
            } else {
                stackChar.add(listChar.get(i));
                stackInt.add(listInt.get(i + 1));
            }
        }
        return helpHandlAddSub(stackInt, stackChar);
    }
    
    public static int helpHandlAddSub(Stack<Integer> stackInt, Stack<Character> stackChar) {
        Stack<Integer> stackInt1 = new Stack<Integer>();
        Stack<Character> stackChar1 = new Stack<Character>();
        while (!stackInt.isEmpty()) {
            stackInt1.add(stackInt.pop());
            
        }
        while (!stackChar.isEmpty()) {
            stackChar1.add(stackChar.pop());
            
        }
        while (!stackChar1.isEmpty()) {
            char c = stackChar1.pop();
            int a = stackInt1.pop();
            int b = stackInt1.pop();
            if (c == '+') {
                stackInt1.add(a + b);
            } else {
                stackInt1.add(a - b);
                
            }
        }
        return stackInt1.pop();
    }
}
