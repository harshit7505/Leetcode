class Solution {
    public int search(int[] nums, int target) {

        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            // target mil gaya
            if (nums[mid] == target) {
                return mid;
            }

            // Left half sorted hai
            if (nums[low] <= nums[mid]) {

                // target left sorted half mein hai
                if (nums[low] <= target && target < nums[mid]) {
                    high = mid - 1;
                } 
                else {
                    low = mid + 1;
                }
            }

            // Right half sorted hai
            else {

                // target right sorted half mein hai
                if (nums[mid] < target && target <= nums[high]) {
                    low = mid + 1;
                } 
                else {
                    high = mid - 1;
                }
            }
        }

        return -1;
    }
}