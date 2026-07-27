class Solution {
    public int maxProduct(int[] arr) {
        int n = arr.length;
        int i = 0;
        int j = n-1;
        int res = 0;
        while(i<j){
            if(arr[i]<arr[j]){
                int ans=(arr[i]-1)*(arr[j]-1);
                res=Math.max(res,ans);
                i++;
                
            }
            else{
            
                   int ans=(arr[i]-1)*(arr[j]-1);
                   res = Math.max(res,ans);
                    j--;

                }
        }
            return res;
      }
}
     
