package yksdy.algorithm.map;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Node {
    int v;
    Node left;
    Node right;
    
    public Node(int v) {
        this.v = v;
    }
}

public class NK_2 {
    static Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        int n = scan.nextInt();
        int m = scan.nextInt();
        
        List<List<Integer>> llista = helpGetList(n);
        List<List<Integer>> llistb = helpGetList(m);
        
        Node treea = new Node(llista.get(0).get(2));
        helpGetTree(treea, llista, 1, n, llista.get(0).get(0), llista.get(0).get(1));
        Node treeb = new Node(llistb.get(0).get(2));
        helpGetTree(treeb, llistb, 1, m, llistb.get(0).get(0), llistb.get(0).get(1));
        
//        helpPrint(llista);
//        helpPrint(llistb);
        List<Integer> llist = null;
        helpPrintlist(llist);
    }
    
    public static void helpGetTree(Node tree, List<List<Integer>> llist, int i, int nm, int left, int right) {
        if (i >= nm) {
            return;
        }
        if (left == 0 && right == 0) {
            return;
        }
        if (left > 0) {
            
            tree.left = new Node(llist.get(left - 1).get(2));
            i++;
            helpGetTree(tree, llist, i, nm, llist.get(left - 1).get(0), llist.get(left - 1).get(1));
        }
        if (right > 0) {
            tree.right = new Node(llist.get(right - 1).get(2));
            i++;
            helpGetTree(tree, llist, i, nm, llist.get(right - 1).get(0), llist.get(right - 1).get(1));
        }
        
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
    
}
