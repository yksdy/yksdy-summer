package yksdy.algorithm.hw;

import java.util.Scanner;

public class Newke5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        System.out.println(s);
        System.out.print(Integer.parseInt(s.substring(2), 16));
    }
}
