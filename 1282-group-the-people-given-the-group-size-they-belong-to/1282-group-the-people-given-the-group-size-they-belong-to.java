class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        
        List<List<Integer>> answer = new ArrayList<>();
        int num = groupSizes.length;
        boolean[] check = new boolean[num];
        int[] arr = Arrays.copyOf(groupSizes, num);
        Arrays.sort(arr);
        
        int index = 0;
        while (index < num) {
            List<Integer> sub = new ArrayList<>();
            for (int i = 0; i < num; i++) {
                if (!check[i] && groupSizes[i] == arr[index]) {
                    sub.add(i);
                    check[i] = true;
                }
                if (sub.size() == arr[index]) {
                    index += arr[index];
                    break;
                }
            }
            answer.add(sub);
        }
        
        return answer;
    }
}