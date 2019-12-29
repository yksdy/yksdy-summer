package yksdy.algorithm.hw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Newke_StringLenth {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        ArrayList<String> ts = new ArrayList<String>();
        for (int i = 0; i < x; i++) {
            ts.add(scan.next());
        }
        Collections.sort(ts);
        for (String s : ts) {
            System.out.println(s);
        }
    }
}
