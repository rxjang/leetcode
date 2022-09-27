class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        if (s.length() < 2) return s.length();
        
        String temp;
        int answer = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length() - 1; j++) {
                temp = s.substring(i, j + 1);
                if (temp.contains(s.charAt(j + 1) + "")) {
                    answer = Math.max(answer, temp.length());
                    break;
                }
                answer = Math.max(answer, temp.length() + 1);
            }
        }
        return answer;
    }
}