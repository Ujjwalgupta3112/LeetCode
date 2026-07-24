class Solution {
    public int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];
        int left = 0;
        int right = n - 1;
        int top = 0;
        int bottom = n - 1;
        int num = 1;
        while (top <= bottom && left <= right) {
            for (int col = left; col <= right; col++) {
                result[top][col] = num++;
            }
            top++;
            for (int row = top; row <= bottom; row++) {
                result[row][right] = num++;
            }
            right--;
            if (top <= bottom) {
                for (int col = right; col >= left; col--) {
                    result[bottom][col] = num++;
                }
                bottom--;
            }
            if (left <= right) {
                for (int row = bottom; row >= top; row--) {
                    result[row][left] = num++;
                }
                left++;
            }
        }
        return result;
    }
}