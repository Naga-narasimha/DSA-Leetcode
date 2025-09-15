import java.util.*;

class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> outer = new ArrayList<>();

    
        ArrayList<Integer> inner = new ArrayList<>(); 
        for (int i = 0; i < nums1.length; i++) {
            boolean flag = false;
            for (int j = 0; j < nums2.length; j++) { 
                if (nums1[i] == nums2[j]) {
                    flag = true;
                    break;
                }
            }
            if (!flag && !inner.contains(nums1[i])) { 
                inner.add(nums1[i]);
            }
        }
        outer.add(inner);

        ArrayList<Integer> l = new ArrayList<>();
        for (int i = 0; i < nums2.length; i++) { 
            boolean flag = false;
            for (int j = 0; j < nums1.length; j++) {
                if (nums2[i] == nums1[j]) {
                    flag = true;
                    break;
                }
            }
            if (!flag && !l.contains(nums2[i])) { 
                l.add(nums2[i]);
            }
        }
        outer.add(l);

        return outer;
    }
}
