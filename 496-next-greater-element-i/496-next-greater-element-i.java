class Solution {
    
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int length = nums1.length;
        int[] answer = new int[length];
        
        for (int i = 0; i < length; i++) {
            answer[i] = findGreaterNum(nums1[i], nums2);
        }
        return answer;
    }
    
    
    public int findGreaterNum(int target, int[] nums) {
        
        boolean exist = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                exist = true;
            }
            if (exist && nums[i] > target) {
                return nums[i];
            }
        }
        
        return -1;
    }
}