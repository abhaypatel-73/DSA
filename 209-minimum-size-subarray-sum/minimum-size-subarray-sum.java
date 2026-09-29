class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int low=0, high=0;
        int n= nums.length;
        int res = Integer.MAX_VALUE;
        int Sum=0;
        while(high<n){
            Sum += nums[high];
            while(Sum >= target){
                int len = high-low+1;
                res = Math.min(res, len);
                Sum -= nums[low];
                low++;
            }
            high++;
        }
        return res == Integer.MAX_VALUE ? 0 : res;
    }
}