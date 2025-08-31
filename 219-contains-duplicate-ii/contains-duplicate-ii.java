class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer>m=new HashMap<>();
        int result=0;
       for(int i=0;i<nums.length;i++)
       {
          if(m.containsKey(nums[i]))
          {
          int sum= m.get(nums[i]); 
          result=Math.abs(sum-i);
          if(result<=k)
          return true;
          else
          m.put(nums[i],i);
          }
          else
          m.put(nums[i],i);
       }
       return false;
    }
}