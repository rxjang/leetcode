class Solution {
    
    
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        
        char c;
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            if (stack.isEmpty()) {
                stack.push(c);
                continue;
            }
            
            if (stack.peek() == c) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        
        return stack.stream()
            .map(Object::toString)
            .collect(Collectors.joining());
    }
    
}