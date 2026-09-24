class Solution {
    public int maxProduct(int[] nums) {

        int curr_Product = nums[0];
        int min_Product = nums[0];
        int max_Product = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < 0) {
                int temp = curr_Product;
                curr_Product = min_Product;
                min_Product = temp;
            }
            curr_Product = Math.max(nums[i], curr_Product * nums[i]);
            min_Product = Math.min(nums[i], min_Product * nums[i]);
            max_Product = Math.max(max_Product, curr_Product);
        }

        return max_Product;
    }
}