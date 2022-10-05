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
    
    int answer = 0;
    
    public int sumEvenGrandparent(TreeNode root) {
        checkNode(root, false, false);
        return answer;
    }
    
    private void checkNode(TreeNode node, boolean grandParent, boolean parent) {
        
        if (node == null) return;
        boolean isEven = node.val % 2 == 0;
        if (grandParent) {
            answer += node.val;
        }
        checkNode(node.left, parent, isEven);
        checkNode(node.right, parent, isEven);
    }
    
}