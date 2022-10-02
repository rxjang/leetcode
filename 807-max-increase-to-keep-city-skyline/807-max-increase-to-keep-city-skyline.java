class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int n = grid.length;
        int[][] maxNums = new int[2][n];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                maxNums[0][j] = Math.max(maxNums[0][j], grid[i][j]);
                maxNums[1][j] = Math.max(maxNums[1][j], grid[j][i]);
            }
        }
        
        int answer = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int now = grid[i][j];
                int target = Math.min(maxNums[0][j], maxNums[1][i]);
                answer += now >= target ? 0 : target - now;
            }
        }
        return answer;
    }
}