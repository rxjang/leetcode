class Solution {
    public boolean checkIfPangram(String sentence) {
        Set<Character> set = new HashSet<>();
        
        if (sentence.length() < 26) {
            return false;
        }
        
        for (char c: sentence.toCharArray()) {
            set.add(c);
        }
        return set.size() == 26;
    }
}