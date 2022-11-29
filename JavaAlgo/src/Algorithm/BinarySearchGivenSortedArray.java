class Solution {

    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length;
        while (end >= start) {
            int middle = (start + end)/2;
            if (middle >= nums.length) {
                return -1;
            }
            if (nums[middle] == target) {
                return middle;
            }
            else if (nums[middle] < target) {
                start = middle + 1;
            }
            else {
                end = middle - 1;
            }
        }
        return -1;
        
    }
}
