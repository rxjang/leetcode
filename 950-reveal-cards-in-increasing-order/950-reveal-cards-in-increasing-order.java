class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        int size = deck.length;
        int[] answer = new int[size];
        int[] order = new int[size];
        Arrays.sort(deck);
        Queue<Integer> que = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            que.offer(i);
        }
        for(int i = 0; i < size; i++) {
            order[i] = que.poll();
            que.offer(que.poll());
        }
        
        for (int i = 0; i < size; i++) {
            answer[order[i]] = deck[i];   
        }
        return answer;
    }
}