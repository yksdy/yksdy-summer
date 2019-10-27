package yksdy.algorithm.map;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Leetcode22BFS {
    Solution s = new Solution();
    
    public static void main(String[] args) {
        Leetcode22BFS lc = new Leetcode22BFS();
        
        List<String> list = lc.s.generateParenthesis(3);
        System.out.println(list.toString());
    }
    
    class Solution {
        public List<String> generateParenthesis(int n) {
            List<String> list = new ArrayList<String>();
            
            help(n, list);
            
            return list;
        }
        
        void help(int n, List<String> answer) {
            Queue<Node> queue = new LinkedList<Node>();
            Node node = new Node();
            queue.add(node);
            
            while (!queue.isEmpty()) {
                Node temp = queue.poll();
                if (temp.x < n) {
                    queue.add(new Node(temp.x + 1, temp.y, temp.now + "("));
                    
                }
                if (temp.x > temp.y) {
                    if (temp.y == (n - 1)) {
                        answer.add(temp.now + ")");
                    } else {
                        
                        queue.add(new Node(temp.x, temp.y + 1, temp.now + ")"));
                    }
                }
            }
            
        }
    }
    
    class Node {
        int x = 0;
        int y = 0;
        String now = "";
        
        public Node(int x, int y, String now) {
            this.x = x;
            this.y = y;
            this.now = now;
        }
        
        public Node() {
            
        }
    }
    
}
