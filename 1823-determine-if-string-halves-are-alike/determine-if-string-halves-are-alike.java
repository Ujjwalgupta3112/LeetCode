class Solution {
    public boolean halvesAreAlike(String s) {
        int count1 = 0;
        int count2 = 0;
        int mid = s.length() / 2;
        for (int i = 0; i < mid; i++) {
            if (isVowel(s.charAt(i))) {
                count1++;
            }
            if (isVowel(s.charAt(i + mid))) {
                count2++;
            }
        }
        return count1 == count2;
    }
    public boolean isVowel(char ch) {
        return "aeiouAEIOU".indexOf(ch) != -1;
    }
}