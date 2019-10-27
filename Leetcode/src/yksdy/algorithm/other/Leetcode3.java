package yksdy.algorithm.other;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class Leetcode3 {
    public static void main(String[] args) {
//        test1();
//        test31();
        String str = "abc";
        System.out.println();
    }
    
    public static int lengthOfLongestSubstring(String s) {
        boolean[] arr = new boolean[65536];
        int result = 0;
        for (int i = 0, j = 0;; i++) {
            while (j < s.length() && !arr[s.charAt(j)]) {
                arr[s.charAt(j++)] = true;
            }
            if (result < (j - i)) {
                result = j - i;
            }
            if (j >= s.length()) {
                break;
            }
            while (s.charAt(i) != s.charAt(j)) {
                arr[s.charAt(i++)] = false;
            }
            arr[s.charAt(i)] = false;
            
        }
        return result;
    }
    
    public static void test1() {
        String s = "abc";
        Vector<Boolean> vec = new Vector<Boolean>(65536);
        System.out.println("b=" + vec.size());
        for (boolean b : vec) {
            System.out.println("b=" + b);
        }
        System.out.println(s.charAt(1));
        System.out.println(vec.get(s.charAt(1)));
    }
    
    public static void test2() {
        String s = "abc";
        List<Boolean> vec = new ArrayList<Boolean>(65536);
        System.out.println("b=" + vec.size());
        for (boolean b : vec) {
            System.out.println("b=" + b);
        }
        System.out.println(s.charAt(1));
        System.out.println(vec.get(s.charAt(1)));
        
    }
    
    public static void test3() {
        String s = "abc";
        boolean[] vec = new boolean[65536];
        System.out.println("b=" + vec.length);
        for (boolean b : vec) {
//            System.out.println("b=" + b);
        }
        System.out.println(s.charAt(1));
        System.out.println(vec[s.charAt(1)]);
        
    }
    
    public static void test31() {
        String s = "abc";
        boolean[] vec = new boolean[65536];
        Arrays.fill(vec, true);
        System.out.println("b=" + vec.length);
        for (boolean b : vec) {
//            System.out.println("b=" + b);
        }
        System.out.println(s.charAt(1));
        System.out.println(vec[s.charAt(1)]);
        
    }
}
