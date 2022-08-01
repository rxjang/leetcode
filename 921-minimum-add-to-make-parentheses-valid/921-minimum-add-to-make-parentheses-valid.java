class Solution {
    public int minAddToMakeValid(String s) {
        int size = 0;
        Stack<Character> stack = new Stack<>();
        char[] arr = s.toCharArray();
        
        for (int i = 0; i < arr.length; i++) {
            if (stack.isEmpty()) {
                stack.push(arr[i]);
                size ++;
                continue;
            }
            
            if (stack.peek() == '(' && arr[i] == ')') {
                stack.pop();
                size --;
            } else {
                stack.push(arr[i]);
                size++;
            }
        }
        
        return size;
    }
}