class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] res = new int[nums.length];
        int s=res.length-1;
        int i=0;
        int j=nums.length-1;
        while(i<=j){
            int leftsq=nums[i]*nums[i];
            int rightsq=nums[j]*nums[j];
            if(leftsq<=rightsq){
                res[s]=rightsq;
                s--;
                j--;
                
                

            }
            else{
                res[s]=leftsq;
                s--;
                i++;
            }
        }
        return res;
        
    }
}