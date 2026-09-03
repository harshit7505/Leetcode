class Solution {
    public int[] searchRange(int[] nums, int target) {
        int low=0; int high=nums.length-1;int res=-1;
        while(low<=high){
            int guess=(low+high)/2;
            if(nums[guess]==target){
                res=guess;
                high=guess-1;
            }else if(nums[guess]<target) low=guess+1;
            else high=guess-1;
        }
        int low1=0; int high1=nums.length-1;
        int res1=-1;
        while(low1<=high1){
            int guess=(low1+high1)/2;
            if(nums[guess]==target){
                res1=guess;
                low1=guess+1;
            }else if(nums[guess]<target) low1=guess+1;
            else high1=guess-1;
        }
        if(res!=-1 && res1==-1) return new int[]{res,res};
        else if(res!=-1 && res1!=-1) return new int[]{res,res1};
        else return new int[]{-1,-1};
    }
}