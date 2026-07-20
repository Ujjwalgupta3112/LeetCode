class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        for (int row = 0; row < accounts.length; row++) {
            int wealth = 0;
            for (int col = 0; col < accounts[row].length; col++) {
                wealth += accounts[row][col];
            }
            maxWealth = Math.max(maxWealth, wealth);
        }
        return maxWealth;
    }
}