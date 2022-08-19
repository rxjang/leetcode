class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int length = boxTypes.length;
        
        Arrays.sort(boxTypes, (a, b) -> Integer.compare(b[1], a[1]));
        
        int answer = 0;
        for (int i = 0; i < length; i++) {
            int remains = truckSize > boxTypes[i][0] ? boxTypes[i][0] : truckSize;
            answer += remains * boxTypes[i][1];
            truckSize -= remains;
            if (truckSize <= 0) {
                return answer;
            }
        }
        
        return answer;
    }
}