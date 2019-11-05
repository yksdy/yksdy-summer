package yksdy.algorithm.map;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        
        String firstStr = scan.next();
        if (size == 2) {
            System.out.println(new StringBuilder(firstStr).reverse().toString());
        }
        int len = firstStr.length();
        int[][] map = new int[len][len];
        help(map, len, firstStr, firstStr);
        for (int ii = 1; ii < size; ii++) {
            String temp = scan.next();
            help(map, len, firstStr, temp);
        }
        
        int num = (size + 1) / len;
        
        String ss = "";
        
//        System.out.println("-======-");
//        for (int i = 0; i < len; i++) {
//            for (int j = 0; j < len; j++) {
//                System.out.print(map[i][j] + " ");
//            }
//            System.out.println();
//        }
//        System.out.println("--");
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (map[i][j] < num) {
                    ss += firstStr.charAt(j);
                }
            }
        }
        System.out.println(ss);
    }
    
    public static void help(int[][] map, int len, String tar, String sour) {
        for (int i = 0; i < len; i++) {
            int k = tar.indexOf(sour.charAt(i));
            if (k >= 0) {
                map[i][k]++;
            }
        }
    }
}
