class Solution {
    public int minOperations(String[] logs) {
        Stack<String> stack = new Stack<>();
        
        for (int i = 0; i < logs.length; i++) {
            String log = logs[i];
            
            if ("./".equals(log)) continue;
            
            if ("../".equals(log)) {
                if (!stack.isEmpty()) {                
                    stack.pop();
                }
            } else {
                stack.push(log);
            }
        }
        
        int answer = 0;
        while (!stack.isEmpty()) {
            stack.pop();
            answer ++;
        }
        
        return answer;
    }
}