class Solution {
    public int maxDepth(String s) {
        
        if (s.length() == 0) {
            return 0;
        }
        
        int max = 0;
        
        Stack<Character> st = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);
            if (temp == '(') {
                st.push(temp);
            } else if (temp == ')') {
                max = Math.max(max, st.size());
                st.pop();
            }
        }
        
        return max;
    }
}