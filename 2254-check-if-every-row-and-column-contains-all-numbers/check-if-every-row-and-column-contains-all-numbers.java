class Solution {
    public boolean checkValid(int[][] m) {
        int n = m.length;
        for (int i = 0; i < n; i++) {
            HashSet<Integer> set = new HashSet<>();
            for (int j = 0; j < n; j++) {
                set.add(m[i][j]);
            }
            if (set.size() != n) return false; // Row must have all numbers 1..n
        }
        for (int j = 0; j < n; j++) {
            HashSet<Integer> set = new HashSet<>();
            for (int i = 0; i < n; i++) {
                set.add(m[i][j]);
            }
            if (set.size() != n) return false; // Column must have all numbers 1..n
        }

        return true;
    }
}
