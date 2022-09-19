class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int answer = 0;
        
        for (String word : words) {
            if (word.replaceAll("[" + allowed + "]", "").length() == 0) {
                answer++;
            }
        }
        
        return answer;
    }
}