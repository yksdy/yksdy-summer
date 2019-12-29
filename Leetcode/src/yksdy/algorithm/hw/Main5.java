//
//package yksdy.algorithm.hw;
//
//import java.util.Scanner;
//
//import javax.script.ScriptEngine;
//import javax.script.ScriptEngineManager;
//
//public class Main5 {
//    
//    static ScriptEngine jse = new ScriptEngineManager().getEngineByName("JavaScript");
//    
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        String ss = "1+2*3";
//        System.out.println(getResult(ss));
//    }
//    
//    static String getResult(String s) {
//        try {
//            Object temp = jse.eval(s);
//            return temp.toString();
//        } catch (Exception e) {
//            String result = "表达式异常";
//            return result;
//        }
//    }
//}
