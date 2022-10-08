class Solution {
    public int[] minOperations(String boxes) {
        int size = boxes.length();
        char[] arr = boxes.toCharArray();
        int[] answer = new int[size];
        
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j) continue;
                if (arr[j] == '1') {
                    answer[i] += Math.abs(i - j);    
                }
            }
        }
        return answer;
    }
}