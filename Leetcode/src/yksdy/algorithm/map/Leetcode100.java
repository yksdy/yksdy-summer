package yksdy.algorithm.map;

public class Leetcode100 {
    Solution s = new Solution();
    
    public static void main(String[] args) {
        TreeNode p = null;
        TreeNode q = null;
        System.out.println(new Leetcode100().s.isSameTree(p, q));
    }
    
    class Solution {
        public boolean isSameTree(TreeNode p, TreeNode q) {
            if (p == null) {
                return q == null ? true : false;
            } else {
                if (q == null) {
                    return false;
                }
            }
            return p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        }
    }
    
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        
        TreeNode(int x) {
            val = x;
        }
    }
}
