/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int val;
    public boolean isUnivalTree(TreeNode root) {
        val = root.val;
        return isSame(root);
    }
    
    private boolean isSame(TreeNode root) {
        if (root == null) {
            return true;
        }
        
        if (root.val != val) {
            return false;
        }
        
        return isSame(root.left) && isSame(root.right);
    }
}