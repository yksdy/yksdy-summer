package yksdy.algorithm.hw;

public class Test {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[][] x = { { 0, 1, 1, 1 }, { 1, 1, 1, 1 }, { 0, 1, 1, 1 } };
        System.out.println(s.countSquares(x));
    }
}

class Solution {
    public int countSquares(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int num = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                int x = row - i;
                if (x > (col - j)) {
                    x = col - j;
                }
                for (int inx = 0; inx < x; inx++) {
                    if (matrix[i + inx][j + inx] == 1) {
                        num = num + help(matrix, i, j, inx);
                    }
                }
//                System.out.println("n = " + i + " m = " + j + " num = " + num + " x = " + x);
            }
        }
        return num;
    }
    
    public int help(int[][] matrix, int i, int j, int x) {
        int res = 0;
        int temp = 0;
        for (int wx = 0; wx <= x; wx++) {
            for (int wy = 0; wy <= x; wy++) {
                temp += matrix[i + wx][j + wy];
            }
        }
        if (temp == (x + 1) * (x + 1)) {
            res++;
        }
//            System.out.println();
        return res;
    }
}