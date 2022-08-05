class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        Stack<Character> s1 = new Stack<>();
        Stack<Character> s2 = new Stack<>();
        
        int[] arr = new int[seq.length()];

        for (int i = 0; i < seq.length(); i++) {
            char c = seq.charAt(i);
            
            if (c == '(') {
                if (s1.size() <= s2.size()) {
                    s1.push(c);
                    arr[i] = 0;
                } else {
                    s2.push(c);
                    arr[i] = 1;
                }
            } else {
                if (s1.size() >= s2.size()) {
                    s1.pop();
                    arr[i] = 0;
                } else {
                    s2.pop();
                    arr[i] = 1;
                }
            }
        } 
        
        return arr;
    }
}