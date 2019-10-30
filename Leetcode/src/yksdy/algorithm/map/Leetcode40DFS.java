package yksdy.algorithm.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode40DFS {
    Solution s = new Solution();
    
    public static void main(String[] args) {
        int[] can = { 3, 2, 7, 2, 6 };
        List<List<Integer>> b = new Leetcode40DFS().s.combinationSum2(can, 7);
        System.out.println("--------");
        System.out.println(b.size());
        System.out.println(b);
    }
    
    class Solution {
        public List<List<Integer>> combinationSum2(int[] candidates, int target) {
            Arrays.sort(candidates);
            List<Integer> path = new ArrayList<Integer>();
            List<List<Integer>> ans = new ArrayList<>();
            help(candidates, 0, 0, target, path, ans, true);
            return ans;
        }
        
        void help(int[] can, int now, int sum, int target, List<Integer> path, List<List<Integer>> ans, boolean flag) {
            if (sum > target) {
                return;
            }
            if (now >= (can.length)) {
                if (sum == target) {
                    System.out.println("---" + path);
                    ans.add(new ArrayList<Integer>(path));
                    System.out.println("--###-" + ans);
                }
                return;
            }
            if (now == 0 || can[now] != can[now - 1] || flag) {
                path.add(can[now]);
//                System.out.println(path);
                help(can, now + 1, sum + can[now], target, path, ans, true);
                path.remove(path.size() - 1);
            }
            help(can, now + 1, sum, target, path, ans, false);
        }
    }
}
