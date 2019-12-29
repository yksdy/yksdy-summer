package yksdy.algorithm.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Leetcode1208 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = { 1, 2, 2 };
        int[] arr1 = { 3, 3, 3, 3, 3, 1, 3 };
        int[] arr2 = { 2, 2, 1, 1, 1, 1, 1, 1 };
        List<List<Integer>> ll = s.groupThePeople(arr2);
        System.out.println(ll);
    }
}

class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> lists = new ArrayList<List<Integer>>();
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        Map<Integer, List<Integer>> maplist = new HashMap<Integer, List<Integer>>();
        List<Integer> list = null;
        for (int i = 0; i < groupSizes.length; i++) {
            
            int val = groupSizes[i];
            if (map.get(val) == null) {
                if (list != null) {
                    maplist.put(val, list);
                }
                list = new ArrayList<Integer>();
                map.put(val, (val - 1));
                list.add(i);
                maplist.put(val, list);
                if (val == 1) {
                    lists.add(list);
                    map.remove(val);
                    list = null;
                }
            } else {
                list = maplist.get(val);
                if (map.get(val) == 0) {
                    list = new ArrayList<Integer>();
                    map.put(val, val - 1);
                    list.add(i);
                    maplist.put(val, list);
                } else if (map.get(val) == 1) {
                    list.add(i);
                    lists.add(list);
                    map.put(val, 0);
                } else {
                    map.put(val, map.get(val) - 1);
                    list.add(i);
                    maplist.put(val, list);
                }
            }
        }
        
        return lists;
    }
    
}
