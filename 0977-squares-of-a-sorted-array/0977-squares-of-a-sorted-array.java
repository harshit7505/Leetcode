class Solution {
    public int[] sortedSquares(int[] nums) {

        int n= nums.length;
        int i=0;
        int j=n-1;
        int res[] = new int[n];
        int m = n-1;
        while(i<=j){
             int l=nums[i]*nums[i];
              int k= nums[j]*nums[j];
            if(l>=k){
                res[m]=l;
                i++;
            }
            else{
                res[m]=k;
                j--;
                
            }
            m--;
            
        }
        return res;
    
    

    }
}