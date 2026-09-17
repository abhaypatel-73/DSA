class Solution {
    public int[] searchRange(int[] nums, int target) {
        int firstPos = -1;
        int lastPos = -1;
        int first = 0;
        int last = nums.length - 1;
        while (first <= last) {
            int mid = first + (last - first) / 2;

            if (nums[mid] == target) {
                firstPos = mid;
                last = mid - 1;   
            } 
            else if (nums[mid] < target) {
                first = mid + 1;
            } 
            else {
                last = mid - 1;
            }
        }
        first = 0;
        last = nums.length - 1;
        while (first <= last) {
            int mid = first + (last - first) / 2;
            if (nums[mid] == target) {
                lastPos = mid;
                first = mid + 1; 
            } 
            else if (nums[mid] < target) {
                first = mid + 1;
            } 
            else {
                last = mid - 1;
            }
        }
        return new int[]{firstPos, lastPos};
    }
}