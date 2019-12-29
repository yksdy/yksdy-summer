package yksdy.algorithm.hw;

import java.util.Scanner;

public class Newke1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        System.out.println(s);
        int i = s.lastIndexOf(" ");
        System.out.println(s.length());
        System.out.println(i);
        System.out.println(s.length() - i - 1);
        
    }
}
