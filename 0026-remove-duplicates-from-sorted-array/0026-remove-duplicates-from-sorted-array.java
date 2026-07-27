class Solution {
    public int removeDuplicates(int[] nums) {
        int n= nums.length;
        int i=0;
        int j=i+1;
        int k=1;
        while(j<n){
            if(nums[i]==nums[j]){
                j++;
                continue;
            }
            else{
                nums[i+1]=nums[j];
                i++;
                j++;
                k++;
            }
        }
        return k;
        
    }
}