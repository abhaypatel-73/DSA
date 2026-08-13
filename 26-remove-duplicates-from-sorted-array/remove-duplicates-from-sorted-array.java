class Solution {
    public int removeDuplicates(int[] nums) {
        int fp = 0;
        int sp = 0;
        int count = 1;
        while(sp<nums.length){
            if(nums[fp]==nums[sp]){
                sp++;
            }
            else{
                count++;
                fp++;
                nums[fp]=nums[sp];
            }
        }
        return count;
    }
}