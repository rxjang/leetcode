class Solution {
    public String restoreString(String s, int[] indices) {
        int size = indices.length;
        char[] arr = new char[size];
        for (int i = 0; i < size; i++) {
            arr[indices[i]] = s.charAt(i);
        }
        return new String(arr);
    }
}