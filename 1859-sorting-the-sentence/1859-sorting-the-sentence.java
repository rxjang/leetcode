import java.util.StringTokenizer;

class Solution {
    public String sortSentence(String s) {
        StringTokenizer st = new StringTokenizer(s);
        String[] arr = new String[9];
        int i = 0;
        while(st.hasMoreTokens()) {
            arr[i++] = st.nextToken();
        }
        
        String[] answer = new String[i];
        for (i = 0; i < answer.length; i++) {
            String temp = arr[i];
            int size = temp.length() - 1;
            int num = temp.charAt(size) - '0';
            answer[num - 1] = temp.substring(0, size);
        }
        
        StringBuilder sb = new StringBuilder();
        for (String a : answer) {
            sb.append(a).append(" ");
        }
        return sb.toString().trim();
    }
}