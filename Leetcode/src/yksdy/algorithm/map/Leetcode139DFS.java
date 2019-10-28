package yksdy.algorithm.map;

import java.util.Arrays;
import java.util.List;

public class Leetcode139DFS {
    Solution s = new Solution();
    
    public static void main(String[] args) {
        String s = "a";
        List<String> wordDict = Arrays.asList("");
        boolean b = new Leetcode139DFS().s.wordBreak(s, wordDict);
        System.out.println("--------");
        System.out.println(b);
    }
    
    class Solution {
        public boolean wordBreak(String s, List<String> wordDict) {
            boolean[] have = new boolean[s.length()];
            return help(s, 0, have, wordDict);
        }
        
        boolean help(String s, int now, boolean[] have, List<String> wordDict) {
            if (now == (s.length())) {
                return true;
            }
            if (have[now]) {
                return false;
            }
            have[now] = true;
            for (int i = now; i < s.length(); i++) {
                if (wordDict.contains(s.substring(now, i + 1)) && help(s, i + 1, have, wordDict)) {
                    return true;
                }
            }
            return false;
        }
    }
}
