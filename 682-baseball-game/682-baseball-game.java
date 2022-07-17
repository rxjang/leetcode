class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < ops.length; i++) {
            String s = ops[i];
            switch (s) {
                case "C":
                    stack.pop();
                    break;
                case "D":
                    int peek = stack.peek();
                    stack.push(peek * 2);
                    break;
                case "+":
                    int pop = stack.pop();
                    int peek2 = stack.peek();
                    stack.push(pop);
                    stack.push(peek2 + pop);
                    break;
                default:
                    stack.push(Integer.parseInt(s));
            }
        }

        int answer = 0;
        
        while (!stack.isEmpty()) {
            answer += stack.pop();
        }
        
        return answer;
    }
}