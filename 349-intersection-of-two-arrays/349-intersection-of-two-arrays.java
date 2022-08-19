class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        boolean[] arr1 = new boolean[1001];
        boolean[] arr2 = new boolean[1001];

        
        for (int i = 0; i < nums1.length; i++) {
            arr1[nums1[i]] = true;
        }
        
        for (int i = 0; i < nums2.length; i++) {
            arr2[nums2[i]] = true;
        }
        
        List<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] && arr2[i]) {
                list.add(i);
            }
        }
        
        
        return list.stream()
            .mapToInt(i -> i)
            .toArray();
    }
}