class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> answer = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
    
        int index = 0;
        int length = target.length;
        for(int i = 0; i < target[length - 1]; i++) {
            push(i + 1, stack, answer);
            if (i >= target[index]) index ++;
            if (stack.peek() < target[index]) pop(stack, answer);
        }
        
        return answer;
    }
    
    public void push(int i, Stack<Integer> stack, List<String> answer) {
        stack.push(i);
        answer.add("Push");
    }
    
    public void pop(Stack<Integer> stack, List<String> answer) {
        stack.pop();
        answer.add("Pop");
    }
    
    
}