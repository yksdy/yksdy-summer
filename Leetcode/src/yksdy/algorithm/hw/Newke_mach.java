package yksdy.algorithm.hw;

import java.util.Scanner;

public class Newke_mach {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String regex = "^[ASWN]{1}[0-9]{2}$";
        while (scan.hasNext()) {
            String s = scan.next();
            if (s.matches(regex)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
                
            }
        }
    }
}
