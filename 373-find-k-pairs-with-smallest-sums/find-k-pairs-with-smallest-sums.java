class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        if (nums1.length == 0 || nums2.length == 0 || k == 0) {
            return ans;
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> Integer.compare(a[2], b[2])
        );
        for (int i = 0; i < Math.min(nums1.length, k); i++) {
            pq.offer(new int[]{i, 0, nums1[i] + nums2[0]});
        }
        while (k > 0 && !pq.isEmpty()) {
            int[] cur = pq.poll();
            int i = cur[0];
            int j = cur[1];
            ans.add(Arrays.asList(nums1[i], nums2[j]));
            k--;
            if (j + 1 < nums2.length) {
                pq.offer(new int[]{i, j + 1, nums1[i] + nums2[j + 1]});
            }
        }
        return ans;
    }
}