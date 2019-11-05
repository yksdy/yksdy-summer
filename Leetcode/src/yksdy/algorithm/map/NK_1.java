package yksdy.algorithm.map;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NK_1 {
    static Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        int n = scan.nextInt();
        int m = scan.nextInt();
        
        List<List<Integer>> llista = helpGetList(n);
        List<List<Integer>> llistb = helpGetList(m);
        
//        helpPrint(llista);
//        helpPrint(llistb);
        List<Integer> llist = null;
        if (n > (m + 2)) {
            llist = help(llista, llistb, m);
            for (int i = m + 2; i < n; i++) {
                llist.add(llista.get(i).get(2));
            }
        } else {
            llist = help(llista, llistb, n);
            for (int i = n + 2; i < m; i++) {
                llist.add(llistb.get(i).get(2));
            }
        }
        helpPrintlist(llist);
    }
    
    public static void helpPrint(List<List<Integer>> list) {
        System.out.println(list);
    }
    
    public static void helpPrintlist(List<Integer> list) {
        list.forEach(rr -> {
            if (rr > 0) {
                System.out.print(rr + " ");
            }
        });
    }
    
    public static List<List<Integer>> helpGetList(int x) {
        
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        
        for (int i = 0; i < x; i++) {
            List<Integer> templist = new ArrayList<Integer>();
            for (int j = 0; j < 3; j++) {
                templist.add(scan.nextInt());
            }
            list.add(templist);
        }
        return list;
        
    }
    
    public static List<Integer> help(List<List<Integer>> a, List<List<Integer>> b, int n) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(a.get(0).get(2) + b.get(0).get(2));
        
        for (int i = 0; i < n; i++) {
            int x = 0;
            int y = 0;
            int z = 0;
            if (a.get(i).get(0) > 0) {
                z = a.get(i).get(0) - 1;
                x = a.get(z).get(2);
                
            }
            if (b.get(i).get(0) > 0) {
                z = b.get(i).get(0) - 1;
                y = b.get(z).get(2);
            }
            list.add(x + y);
            x = 0;
            y = 0;
            if (a.get(i).get(1) > 0) {
                z = a.get(i).get(1) - 1;
                x = a.get(z).get(2);
            }
            if (b.get(i).get(1) > 0) {
                z = b.get(i).get(1) - 1;
                y = b.get(z).get(2);
            }
            list.add(x + y);
            x = 0;
            y = 0;
        }
        
        return list;
    }
}
