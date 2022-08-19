class Solution {
    public int minimumOperations(int[] nums) {
        Arrays.sort(nums);
        int answer = nums[0] == 0 ? 0 : 1;
        
        if (nums.length == 1) {
            return answer;
        }
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] < nums[i]) {
                answer ++;
            }
        }
        
        return answer;
    }
}