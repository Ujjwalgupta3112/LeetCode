class Solution {
    public boolean judgeCircle(String moves) {
        int vertical = 0;
        int horizontal = 0;
        for (int i = 0; i < moves.length(); i++) {
            char ch = moves.charAt(i);
            if (ch == 'U') {
                vertical++;
            }
            else if (ch == 'D') {
                vertical--;
            }
            else if (ch == 'R') {
                horizontal++;
            }
            else if (ch == 'L') {
                horizontal--;
            }
        }
        return vertical == 0 && horizontal == 0;
    }
}