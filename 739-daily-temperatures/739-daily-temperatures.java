class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] answer = new int[temperatures.length];
        
        for (int i = 0; i < temperatures.length; i++) {
            int day = 0;
            boolean exist = false;
            for (int j = i + 1; j < temperatures.length; j++) {
                day++;
                if (temperatures[i] < temperatures[j]) {
                    exist = true;
                    break;
                }
            }
            answer[i] = exist ? day : 0;
        }
        
        return answer;
    }
}