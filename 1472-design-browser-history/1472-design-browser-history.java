class BrowserHistory {
    
    private Stack<String> stackB;
    private Stack<String> stackF;
    private int size;

    public BrowserHistory(String homepage) {
        stackB = new Stack<>();
        stackF = new Stack<>();
        size = 1;
        stackB.push(homepage);
    }
    
    public void visit(String url) {
        
        stackB.push(url);
        size++;
        
        if (!stackF.isEmpty()) {
            stackF.clear();
        }
    }
    
    public String back(int steps) {
        for (int i = 0; i < steps && size > 1; i++) {
            stackF.push(stackB.pop());
            size--;
        }
        return stackB.peek();
    }
    
    public String forward(int steps) {
        for (int i = 0; i < steps && !stackF.isEmpty(); i++) {
            stackB.push(stackF.pop());
            size++;
        }
        return stackB.peek();
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */