package yksdy.algorithm.map;

public class Leetcode331 {
    Solution s = new Solution();
    
    public static void main(String[] args) {
        String s = "9,3,4,#,#,1,#,#,2,#,6,#,#";
        boolean list = new Leetcode331().s.isValidSerialization(s);
        System.out.println(list);
    }
    
    class Solution {
        public boolean isValidSerialization(String preorder) {
            if (preorder == null || preorder.equals("")) {
                return true;
            }
            int x = 1;
            String[] ss = preorder.split(",");
            for (int i = 0; i < ss.length; i++) {
                x = x - 1;
                if (x < 0) {
                    return false;
                }
                if (!ss[i].equals("#")) {
                    x = x + 2;
                }
            }
            return x == 0 ? true : false;
        }
    }
}