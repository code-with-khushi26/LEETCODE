
class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {

        int n = nums.size();

        long[] prefix = new long[n + 1];

        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + nums.get(i);
        }

        TreeMap<Long, Integer> map = new TreeMap<>();

        long ans = Long.MAX_VALUE;

        for (int i = l; i <= n; i++) {

            // Add the newly valid starting prefix
            long add = prefix[i - l];
            map.put(add, map.getOrDefault(add, 0) + 1);

            // Remove expired starting prefix
            int removeIndex = i - r - 1;

            if (removeIndex >= 0) {
                long remove = prefix[removeIndex];

                if (map.get(remove) == 1) {
                    map.remove(remove);
                } else {
                    map.put(remove, map.get(remove) - 1);
                }
            }

            // Largest prefix strictly smaller than current prefix
            Long best = map.lowerKey(prefix[i]);

            if (best != null) {
                ans = Math.min(ans, prefix[i] - best);
            }
        }

        return ans == Long.MAX_VALUE ? -1 : (int) ans;
    }
}
