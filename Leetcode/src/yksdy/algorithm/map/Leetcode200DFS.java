package yksdy.algorithm.map;

public class Leetcode200DFS {
    Solution s = new Solution();
    
    public static void main(String[] args) {
        char[][] c = {};
        int i = new Leetcode200DFS().s.numIslands(c);
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
            if (n == 0) {
                return 0;
            }
            m = grid[0].length;
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
            if (i >= n || i < 0 || j >= m || j < 0 || grid[i][j] == '0') {
                return;
            }
            if (grid[i][j] == '1') {
                grid[i][j] = '0';
            }
            help(i - 1, j, grid);
            help(i + 1, j, grid);
            help(i, j - 1, grid);
            help(i, j + 1, grid);
            
        }
    }
}
