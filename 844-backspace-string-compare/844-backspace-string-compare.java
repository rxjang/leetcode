class Solution {
    public boolean backspaceCompare(String s, String t) {
        s = process(s);
        t = process(t);
        
        return s.equals(t);
    }
    
    
    private String process(String text) {
        Stack<Character> stack = new Stack<>();
        
        for (char c: text.toCharArray()) {
           if (c != '#') {
                stack.push(c);               
           } else if (!stack.empty()) {
                stack.pop();               
           }
        }
        
        return String.valueOf(stack);
    }
}