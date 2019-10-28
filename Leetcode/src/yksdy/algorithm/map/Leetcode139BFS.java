package yksdy.algorithm.map;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Leetcode139BFS {
    Solution s = new Solution();
    
    public static void main(String[] args) {
        String s = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab";
        List<String> wordDict = Arrays.asList("a", "aa", "aaa", "aaaa", "aaaaa", "aaaaaa", "aaaaaaa", "aaaaaaaa",
                "aaaaaaaaa", "aaaaaaaaaa");
        boolean b = new Leetcode139BFS().s.wordBreak(s, wordDict);
        System.out.println("--------");
        System.out.println(b);
    }
    
    class Solution {
        public boolean wordBreak(String s, List<String> wordDict) {
            boolean[] have = new boolean[s.length()];
            return help(s, 0, wordDict, have);
        }
        
        boolean help(String s, int now, List<String> wordDict, boolean[] have) {
            Queue<Integer> queue = new LinkedList<Integer>();
            queue.add(now);
            have[now] = true;
            while (!queue.isEmpty()) {
                int x = queue.poll();
                for (int i = x; i < s.length(); i++) {
                    if (wordDict.contains(s.substring(x, i + 1))) {
                        if (i + 1 == s.length()) {
                            return true;
                        } else {
                            if (!have[i + 1]) {
                                queue.add(i + 1);
                                have[i + 1] = true;
                            }
                        }
                    }
                }
            }
            return false;
        }
    }
}
