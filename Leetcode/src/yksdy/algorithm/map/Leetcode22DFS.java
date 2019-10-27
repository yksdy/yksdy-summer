package yksdy.algorithm.map;

import java.util.ArrayList;
import java.util.List;

public class Leetcode22DFS {
    public static void main(String[] args) {
        List<String> list = new Solution().generateParenthesis(4);
        System.out.println(list.toString());
    }
    
}

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<String>();
        
        help(0, 0, n, "", list);
        
        return list;
    }
    
    void help(int x, int y, int n, String now, List<String> answer) {
        if (y == n) {
            answer.add(now);
        }
        if (x < n) {
            help(x + 1, y, n, now + "(", answer);
        }
        
        if (x > y) {
            help(x, y + 1, n, now + ")", answer);
        }
    }
}