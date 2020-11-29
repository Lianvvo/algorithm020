/**
 * 字母异位词分组
 */
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0) {
            return new ArrayList<>();
        }
        HashMap<String,ArrayList> stringListHashMap = new HashMap<>();
        for (String s : strs) {
            char[] ca = s.toCharArray();
            Arrays.sort(ca);
            String key = String.valueOf(ca);
            if (!stringListHashMap.containsKey(key)) {
                stringListHashMap.put(key,new ArrayList());
            }
            stringListHashMap.get(key).add(s);
        }
        return new ArrayList(stringListHashMap.values());
        //加ArrayList<>括号会报错。
    }
}