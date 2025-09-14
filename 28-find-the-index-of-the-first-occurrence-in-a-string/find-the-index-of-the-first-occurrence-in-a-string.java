class Solution {
    public int strStr(String h, String n) {
        if (n.length() == 0) {
            return 0;
        }
        int hLen = h.length();
        int nLen = n.length();
        for (int i = 0; i <= hLen - nLen; i++) {
            String sub = h.substring(i, i + nLen);
            if (sub.equals(n)) {
                return i;
            }
        }

        return -1; 
    }
}
