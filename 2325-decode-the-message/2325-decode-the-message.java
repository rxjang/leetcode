class Solution {
    public String decodeMessage(String key, String message) {
        key = key.replace(" ", "");
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0, check = 0; i < key.length(); i++) {
            char c = key.charAt(i);
            if (!map.containsKey(c)) {
                map.put(c, i - check); 
            } else {
                check++;
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for (char c: message.toCharArray()) {
            
            if (c == ' ') {
                sb.append(c);
                continue;
            }
            sb.append((char) ('a' + map.get(c)));
        }
        
        return sb.toString();
    }
    
}