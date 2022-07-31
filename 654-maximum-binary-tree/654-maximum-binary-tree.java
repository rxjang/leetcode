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
        
        if (nums.length < 1) return null;
        
        int index = findLargestNumber(nums);
        TreeNode root = new TreeNode(nums[index]);
        root.left = constructMaximumBinaryTree(
            Arrays.copyOfRange(nums, 0, index)
        );
        root.right = constructMaximumBinaryTree(
            Arrays.copyOfRange(nums, index + 1, nums.length)
        );
        return root;
    }
    
    public int findLargestNumber(int[] nums) {
        int largest = 0;
        int index = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > largest) {
                index = i;
                largest = nums[i];
            }
        }
        return index;
    }
}