class CustomStack {
    private int size;
    private List<Integer> list;

    public CustomStack(int maxSize) {
        size = maxSize;
        list = new ArrayList<>();
    }
    
    public void push(int x) {
        if (list.size() < size) {
            list.add(x);
        }
    }
    
    public int pop() {
        if (list.size() == 0) {
            return -1;
        }
        return list.remove(list.size() - 1);
    }
    
    public void increment(int k, int val) {
        int last = list.size() < k ? list.size() : k;
        for (int i = 0; i < last; i++) {
            list.add(i, (list.remove(i) + val));
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */