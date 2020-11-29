/**
 * 两数之和
 * 采用hashmap做
 */
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> integerHashMap = new HashMap<>();
        for (int i = 0; i < nums.length; ++i) {
            if (integerHashMap.containsKey(target - nums[i])) {
                return new int[] {integerHashMap.get(target - nums[i]),i};
            }
            integerHashMap.put(nums[i],i);
        }
        return new int[0];
    }
}