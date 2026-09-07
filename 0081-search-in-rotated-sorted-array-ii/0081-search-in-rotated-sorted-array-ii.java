class Solution {
    public boolean search(int[] nums, int target) {

        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            // Target mil gaya
            if (nums[mid] == target) {
                return true;
            }

            // Duplicate ki wajah se decide nahi kar sakte
            if (nums[low] == nums[mid] && nums[mid] == nums[high]) {
                low++;
                high--;
            }

            // Left half sorted hai
            else if (nums[low] <= nums[mid]) {

                // Target left sorted range mein hai
                if (nums[low] <= target && target < nums[mid]) {
                    high = mid - 1;
                }

                // Target right side mein hoga
                else {
                    low = mid + 1;
                }
            }

            // Right half sorted hai
            else {

                // Target right sorted range mein hai
                if (nums[mid] < target && target <= nums[high]) {
                    low = mid + 1;
                }

                // Target left side mein hoga
                else {
                    high = mid - 1;
                }
            }
        }

        return false;
    }
}