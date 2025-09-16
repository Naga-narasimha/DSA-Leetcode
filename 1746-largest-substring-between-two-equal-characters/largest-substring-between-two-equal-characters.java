class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int i = 0, j = 1;
        int sum = 0;
        int result = -1; 
        while (i < s.length()) {
            j = i + 1; 
            while (j < s.length()) { 
                if (s.charAt(i) == s.charAt(j)) {
                    sum = j - i - 1;
                    result = Math.max(result, sum);
                }
                j++;
            }
            i++; 
        }
        return result;
    }
}
