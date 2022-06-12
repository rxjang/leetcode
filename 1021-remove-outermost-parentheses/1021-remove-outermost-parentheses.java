class Solution {
    public String removeOuterParentheses(String s) {
        
        Stack<Character> st = new Stack<>();
        int it = 0;
        
        for (int i = 1; i < s.length() - 1; i++) {
            char temp = s.charAt(i);
            if (it >= 0) {
                st.push(temp);
            } else {
                st.pop();
            }
            it = (temp == '(') ? (it + 1) : (it - 1);
        }
        
        String answer = "";
        while (!st.isEmpty()) {
            answer = String.format("%c%s", st.pop(), answer);
        }
        
        return answer;
    }
}