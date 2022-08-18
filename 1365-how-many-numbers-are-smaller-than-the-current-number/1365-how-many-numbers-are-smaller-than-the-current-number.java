class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] answer = new int[nums.length];
        int[] temp = Arrays.copyOf(nums, nums.length);
        Arrays.sort(temp);
        
        for (int i = 0; i < nums.length; i++) {
            int location = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == temp[j]) {
                    location = j;
                    break;
                }
            }
            
            answer[i] = location;
        }
        
        
        return answer;
    }
}