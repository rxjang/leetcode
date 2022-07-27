class Solution {
    
    
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (char c: s.toCharArray()) {
            
            if (stack.isEmpty() || stack.peek() != c) {
                stack.push(c);
            } else {
                stack.pop();
            }
        }
        
        return stack.stream()
            .map(Object::toString)
            .collect(Collectors.joining());
    }
    
}