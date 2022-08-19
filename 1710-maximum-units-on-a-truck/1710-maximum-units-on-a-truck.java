class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int length = boxTypes.length;
        
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {  
                int[] tmp = new int[2];                           
                if (boxTypes[i][1] < boxTypes[j][1]) {       
                    tmp = boxTypes[i]; 
                    boxTypes[i] = boxTypes[j];
                    boxTypes[j] = tmp;
                }
            }
        }
        
        
        int answer = 0;
        for (int i = 0; i < length; i++) {
            int remains = truckSize > boxTypes[i][0] ? boxTypes[i][0] : truckSize;
            answer += remains * boxTypes[i][1];
            truckSize -= remains;
            if (truckSize <= 0) {
                break;
            }
        }
        
        return answer;
    }
}