package yksdy.algorithm.hw;

import java.util.Scanner;

public class Newke6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int s = scan.nextInt();
        String a = Integer.toBinaryString(s);
        int sum = 0;
        for (int i = 0; i < a.length(); i++) {
            if ('1' == a.charAt(i)) {
                sum++;
            }
        }
        System.out.println(sum);
    }
}
