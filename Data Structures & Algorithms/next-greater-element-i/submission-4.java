class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] res = new int[nums1.length];
        for (int i = 0; i < nums2.length; i++) {
            for (int j = i + 1; j < nums2.length; j++) {
                if (nums2[j] > nums2[i]){
                    map.put(nums2[i], nums2[j]);
                    break;
                }
            }
        }
        for (int i = 0; i < res.length; i++) {
            if (map.get(nums1[i]) != null) {
                res[i] = map.get(nums1[i]);
            }
            else {
                res[i] = -1;
            }
        }
        return res;
    }
}