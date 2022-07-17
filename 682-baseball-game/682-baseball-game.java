class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < ops.length; i++) {
            String s = ops[i];
            if (s.equals("C")) {
                stack.pop();
            } else if (s.equals("D")) {
                int peek = stack.peek();
                stack.push(peek * 2);
            } else if (s.equals("+")) {
                int pop = stack.pop();
                int peek = stack.peek();
                stack.push(pop);
                stack.push(peek + pop);
            } else {
                stack.push(Integer.parseInt(s));
            }
        }

        int answer = 0;
        int size = stack.size();
        for (int i = 0; i < size; i++) {
            answer += stack.pop();
        }
        return answer;
    }
}