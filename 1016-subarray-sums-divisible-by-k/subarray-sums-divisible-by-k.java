class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int[] remainderCounts = new int[k];
        remainderCounts[0] = 1; 
        int runningSum = 0;
        int count = 0;
        for (int num : nums) {
            runningSum += num;
            int remainder = (runningSum % k + k) % k;
            count += remainderCounts[remainder];
            remainderCounts[remainder]++;
        }
        return count;
    }
}