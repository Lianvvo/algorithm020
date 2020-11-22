/**
 这种方法是基于这样一个事实，当我们旋转数组 k 次，k%n个元素从数组的后端到前端，其余的元素从前端向后移动。在这种方法中，我们首先反转数组的所有元素。
 然后，对前面的 k 元素进行反转，接着对其余的 n-k元素进行反转，得到所需的结果。设 n = 7，k = 3。
 */
class Solution {
    public void rotate(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k -1);
        reverse(nums, k, nums.length - 1);
    }
    public void reverse(int[] nums, int start, int end){
        while(start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}