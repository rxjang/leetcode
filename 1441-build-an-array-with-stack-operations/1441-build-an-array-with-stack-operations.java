class Solution {
    
    public static final String PUSH = "Push";
    
    public static final String POP = "Pop";
    
    public List<String> buildArray(int[] target, int n) {
        List<String> answer = new ArrayList<>();
    
        int index = 0;
        int length = target.length;
        for(int i = 0; i < target[length - 1]; i++) {
            answer.add(PUSH);
            
            if (i + 1 >= target[index]) {
                index ++;
            } else {
                answer.add(POP);
            }
        }
        
        return answer;
    }
    
    
}