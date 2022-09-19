class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] arr = {".-","-...","-.-.","-..",".","..-.","--.",
                        "....","..",".---","-.-",".-..","--","-.",
                        "---",".--.","--.-",".-.","...","-","..-",
                        "...-",".--","-..-","-.--","--.."};
        
        Set<String> set = new HashSet<>();
        StringBuilder sb;
        for (String s: words) {
            sb = new StringBuilder();
            for (char c: s.toCharArray()) {
                sb.append(arr[c-'a']);
            }
            set.add(sb.toString());
        }
        return set.size();
    }
}