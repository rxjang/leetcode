class Solution {
    public int findTheWinner(int n, int k) {
        Queue<Integer> que = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            que.add(i + 1);
        }
        
        while (que.size() > 1) {
            for (int i = 0; i < k - 1; i++) {
                que.add(que.poll());
            }
            que.poll();
        }
        return que.poll();
    }
}