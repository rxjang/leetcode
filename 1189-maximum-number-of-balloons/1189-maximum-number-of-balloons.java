class Solution {
    public int maxNumberOfBalloons(String text) {
        Map<Character, Integer> map = new HashMap<>();
        String balloon = "balloon";
        for (char c : balloon.toCharArray()) {
            map.put(c, 0);
        }
        for (char c : text.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            }
        }
        map.put('o', map.get('o') / 2);
        map.put('l', map.get('l') / 2);
        return Collections.min(map.values());
    }
}