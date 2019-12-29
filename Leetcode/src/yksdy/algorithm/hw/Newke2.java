package yksdy.algorithm.hw;

import java.util.Scanner;

public class Newke2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        String t = scan.next();
        s = s.toUpperCase();
        t = t.toUpperCase();
        String[] x = s.split(t);
        System.out.println(x.length-1);
    }
}
