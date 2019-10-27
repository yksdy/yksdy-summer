package yksdy.algorithm.map;

import java.util.LinkedList;
import java.util.Queue;

public class Leetcode200BFS {
    Solution s = new Solution();
    
    public static void main(String[] args) {
        char[][] c = { { '1', '0', '0' }, { '0', '0', '1' } };
        int i = new Leetcode200BFS().s.numIslands(c);
        System.out.println(i);
    }
    
    class Solution {
        int num = 0;
        int n = 0;
        int m = 0;
        
        public int numIslands(char[][] grid) {
            if (grid == null) {
                return 0;
            }
            n = grid.length;
//            System.out.println("n= " + n);
            if (n == 0) {
                return 0;
            }
            m = grid[0].length;
//            System.out.println("m= " + m);
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (grid[i][j] == '1') {
                        num++;
                        help(i, j, grid);
                    }
                }
            }
            return num;
        }
        
        void help(int i, int j, char[][] grid) {
            Queue<Node> queue = new LinkedList<Node>();
            queue.add(new Node(i, j));
            grid[i][j] = '0';
            int[] a = { 1, -1, 0, 0 };
            int[] b = { 0, 0, 1, -1 };
            while (!queue.isEmpty()) {
                Node node = queue.poll();
                for (int z = 0; z < 4; z++) {
                    int xi = a[z] + node.x;
                    int yj = b[z] + node.y;
                    if (xi >= 0 && xi < n && yj >= 0 && yj < m && grid[xi][yj] == '1') {
                        grid[xi][yj] = '0';
                        queue.add(new Node(xi, yj));
                    }
                }
                
            }
        }
    }
    
    class Node {
        int x;
        int y;
        
        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
