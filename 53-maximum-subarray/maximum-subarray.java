class Solution {
    public int maxSubArray(int[] nums) {
        int max_so_far=nums[0];
        int curr_Sum=nums[0];
        int max_Sum=nums[0];
        for(int i=1; i<nums.length; i++){
            curr_Sum=Math.max(nums[i], curr_Sum+nums[i]);
            max_Sum=Math.max(max_Sum, curr_Sum);
        }
        return max_Sum;
    }
}