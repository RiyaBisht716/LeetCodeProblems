class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        // ensure we build map on the smaller array to save space
        if (nums1.length > nums2.length) return intersect(nums2, nums1);

        Map<Integer, Integer> counts = new HashMap<>();
        for (int n : nums1) counts.put(n, counts.getOrDefault(n, 0) + 1);

        List<Integer> resList = new ArrayList<>();
        for (int n : nums2) {
            if (counts.getOrDefault(n, 0) > 0) {
                resList.add(n);
                counts.put(n, counts.get(n) - 1);
            }
        }

        int[] res = new int[resList.size()];
        for (int i = 0; i < resList.size(); i++) res[i] = resList.get(i);
        return res;
   

    }
}