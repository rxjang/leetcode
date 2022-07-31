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
    private int idx = 0;
    public TreeNode bstFromPreorder(int[] preorder) {
        
        return bstFromPreorder(preorder, Integer.MAX_VALUE);
    }
    
    public TreeNode bstFromPreorder(int[] preorder, int max) {
        
        if (idx == preorder.length || preorder[idx] > max) {
            return null;
        }
        
        TreeNode node = new TreeNode(preorder[idx++]);
        node.left = bstFromPreorder(preorder, node.val);
        node.right = bstFromPreorder(preorder, max);
        return node;
    }
}