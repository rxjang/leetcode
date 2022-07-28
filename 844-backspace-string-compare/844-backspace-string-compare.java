class Solution {
    public boolean backspaceCompare(String s, String t) {
        s = process(s);
        t = process(t);
        System.out.println(s);
        System.out.println(t);
        
        return s.equals(t);
    }
    
    
    private String process(String text) {
        Stack<String> stack = new Stack<>();
        
        for (char c: text.toCharArray()) {
            if (c == '#') {
                if (!stack.isEmpty()) {
                    stack.pop();                    
                }
            } else {
                stack.push(String.valueOf(c));
            }
        }
        return String.join("", stack);
    }
}