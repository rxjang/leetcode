class Solution {
    public int[] sortEvenOdd(int[] nums) {
        int length = nums.length;
        Integer[] odd = new Integer[length / 2];
        int[] even = new int[length % 2 == 0 ? length / 2 : length / 2 + 1];
        
        for (int i = 0, o = 0, e = 0 ; i < length; i++) {
            if (i % 2 == 0) {
                even[e++] = nums[i];
            } else {
                odd[o++] = nums[i];
            }
        }
        Arrays.sort(even);
        Arrays.sort(odd, Collections.reverseOrder());
        
        int[] answer = new int[length];
        for (int i = 0, o = 0, e = 0; i < length; i++) {
            answer[i] = i % 2 == 0
                ? even[e++]
                : odd[o++];
        }
        return answer;
    }
}