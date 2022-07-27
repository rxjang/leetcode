class Solution {
    public String makeGood(String s) {
        char[] arr = s.toCharArray();
        Stack<Character> stack = new Stack();
        
        for (int i = 0; i < arr.length; i++) {
            if (stack.isEmpty()) {
                stack.push(arr[i]);
                continue;
            }
            
            if (Math.abs(stack.peek() - arr[i]) == 32) {
                stack.pop();
            } else {
                stack.push(arr[i]);
            }
        }
        
        return stack.stream()
            .map(Object::toString)
            .collect(Collectors.joining());
    }
}