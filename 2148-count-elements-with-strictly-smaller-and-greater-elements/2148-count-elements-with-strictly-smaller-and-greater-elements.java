class Solution {
    public int countElements(int[] nums) {
        Arrays.sort(nums);
        
        int size = nums.length;
        
        return (int) Arrays.stream(nums)
                .filter(a -> (a != nums[0]) && (a != nums[size - 1]))
                .count();
    }
}