package yksdy.algorithm.hw;

import java.util.Scanner;

public class Newke_pingzi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            help(scan.nextInt());
        }
    }
    
    public static void help(int n) {
        int num = 0;
        while ((n - 3) >= -1) {
            n -= 2;
            num++;
        }
        System.out.println(num);
    }
}
