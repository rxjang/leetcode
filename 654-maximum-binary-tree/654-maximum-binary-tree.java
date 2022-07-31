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
    
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        Stack<TreeNode> stack = new Stack<>();
        
        for(int i = 0; i < nums.length; i ++) {
            
            TreeNode node = new TreeNode(nums[i]);
            while(!stack.isEmpty() && stack.peek().val < node.val) {
                node.left = stack.pop();
            }
            if(!stack.isEmpty()) {
                stack.peek().right = node;
            }
            stack.push(node);
        }
        
        TreeNode res = stack.pop();
        
        while(!stack.isEmpty()) {
            res = stack.pop();
        }
        
        return res;
    }
}