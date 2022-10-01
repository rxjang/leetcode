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
    int deepest = 0;
    
    public int deepestLeavesSum(TreeNode root) {
        
        return deepestSum(root, 0)[1];
    }
    
    private int[] deepestSum(TreeNode node, int location) {
        if (node == null) return new int[]{0, 0};
        
        int[] left = deepestSum(node.left, location + 1);
        int[] right = deepestSum(node.right, location + 1);
        
        deepest = Math.max(deepest, location);
        int leftSum = deepest == left[0] ? left[1] : 0;
        int rightSum = deepest == right[0] ? right[1] : 0;
        int sum = leftSum + rightSum;
        if (deepest == location) {
            sum += node.val;
        } 
        return new int[]{deepest, sum};
    }
}