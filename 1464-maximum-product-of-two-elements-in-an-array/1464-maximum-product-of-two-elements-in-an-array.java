class Solution {
    public int maxProduct(int[] arr) {
        Arrays.sort(arr);
        int l = arr[arr.length-2];
        int r = arr[arr.length-1];
        int res = (l-1)*(r-1);
        return res;

    }
}