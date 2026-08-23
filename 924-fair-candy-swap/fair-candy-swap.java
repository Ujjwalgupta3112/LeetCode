import java.util.HashSet;
import java.util.Set;
class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sumA = 0, sumB = 0;
                for (int size : aliceSizes) {
            sumA += size;
        }
        Set<Integer> bobSet = new HashSet<>();
        for (int size : bobSizes) {
            sumB += size;
            bobSet.add(size);
        }
                int diff = (sumA - sumB) / 2;
                for (int a : aliceSizes) {
            int b = a - diff;
            if (bobSet.contains(b)) {
                return new int[] { a, b };
            }
        }
        return new int[0];
    }
}