class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] answer = new int[n * 2];
        
        for (int i = 0, o = 0, e = n; i < answer.length; i++) {
            answer[i] = i % 2 == 0 
                ? nums[o++] 
                : nums[e++];
        }
        return answer;
    }
}