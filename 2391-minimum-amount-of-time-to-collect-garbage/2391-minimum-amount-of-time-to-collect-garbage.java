class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        int answer = 0, m = 0, p = 0, g = 0, i = 0; 
        
        for (String s : garbage) {
            for (char c : s.toCharArray()) {
                switch (c) {
                    case 'M' :
                        answer += m;
                        m = 0;
                        answer ++;
                        break;
                    case 'P' :
                        answer += p;
                        p = 0;
                        answer ++;
                        break;
                    case 'G' :
                        answer += g;
                        g = 0;
                        answer ++;
                        break;
                    default:
                        continue;
                }
            }
            if (i < travel.length) {
                m += travel[i];
                p += travel[i];
                g += travel[i++];
            } 
        }
        return answer;
    }
}