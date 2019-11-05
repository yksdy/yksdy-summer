package yksdy.algorithm.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class YingBI {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] x = { 2, 3, 5 };
        String abc = "abc";
        System.out.println(new StringBuilder(abc).reverse().toString());
        
        Map<String, Integer> map = new HashMap<String, Integer>();
        
        String key = "";
//        combinationSum(x, 8);
    }
    
    public static void combinationSum(int[] candidates, int target) {
        int[] a = new int[1 + target];
        
        a[0] = 1;
        for (int i = 0; i < candidates.length; i++) {
            for (int j = candidates[i]; j <= target; j++) {
                a[j] = a[j] + a[j - candidates[i]];
            }
            System.out.println(a[target]);
        }
        
        System.out.println("--------");
        System.out.println(a[target]);
    }
}
