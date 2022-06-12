class Solution {
    public String removeOuterParentheses(String s) {
        
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int it = 0;
        
        for (char c: s.toCharArray()) {
            if (c == '(') {
                if (it != 0) {
                    sb.append(c);
                }
                it ++;
            } else {
                it --;
                if (it != 0) {
                    sb.append(c);
                }
            }
        }
        
        return sb.toString();
    }
}