class Solution {
    public int[] finalPrices(int[] p) {
        int arr[]=new int[p.length];
        
      for(int i=0;i<p.length;i++)
      {
       arr[i]=p[i];
        for(int j=i+1;j<p.length;j++)
        {
            if(p[j]<=p[i])
            {
             arr[i]=p[i]-p[j];
             break;
            }
        }
      }  
      return arr;
    }
}