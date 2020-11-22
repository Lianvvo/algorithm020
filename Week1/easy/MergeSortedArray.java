/**
 * 合并两个有序数组
 * 题解链接：https://leetcode-cn.com/problems/merge-sorted-array/solution/88-by-ikaruga/
 */
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = nums1.length - 1;
        m--;
        n--;
        while (n >= 0) {
            while (m >= 0 && nums1[m] > nums2[n]) {
                int tem = nums1[i];
                nums1[i--] = nums1[m];
                nums1[m--] = tem;

            }
            int res = nums1[i];
            nums1[i--] = nums2[n];
            nums2[n--] = res;
        }
    }
}