class Solution {
    public void moveZeroes(int[] nums) {
        if (nums.length == 0) return;
        int i = 0;
        for (int lastZero = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int tem = nums[i];
                nums[i] = nums[lastZero];
                nums[lastZero++] = tem;
            }
        }
    }
}