class MyStack {
    
    Queue<Integer> q1;
    Queue<Integer> q2;
    int top;
    int size = 0;

    public MyStack() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }
    
    public void push(int x) {
        top = x;
        size++;
        q1.add(x);
    }
    
    public int pop() {
        for (int i = 0; i < size - 1; i++) {
            top = q1.poll();
            q2.add(top);
        }
        int pop = q1.poll();
        q1 = q2;
        q2 = new LinkedList<>();
        size--;
        return pop;
    }
    
    public int top() {
        
        return top;
    
    }
    
    public boolean empty() {
        return q1.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */