class Solution {
    public int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        
        int answer = 0;
        for (int i : map.values()) {
            for (int j = 1; j < i; j++) {
                answer += j;
            }
        }
        return answer;
    }
}