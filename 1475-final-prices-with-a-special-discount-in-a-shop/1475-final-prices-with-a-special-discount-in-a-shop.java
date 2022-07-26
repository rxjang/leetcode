class Solution {
    public int[] finalPrices(int[] prices) {
        int[] answer = new int[prices.length];
    
        
        for (int i = 0; i < prices.length; i++) {
            answer[i] = getPrice(i, prices);
        }
        
        return answer;
    }
    
    public int getPrice(int i, int[] prices) {
        int original = prices[i];
        
        for (int k = i + 1; k < prices.length; k++) {
            if (prices[k] <= original) {
                return original - prices[k];
            }
        }
        return original;
    }
}