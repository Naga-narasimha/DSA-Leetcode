class Solution {
    public int[] finalPrices(int[] p) {
        int arr[]=new int[p.length];
        
      for(int i=0;i<p.length;i++)
      {
       boolean flag=false;
        for(int j=i+1;j<p.length;j++)
        {
            if(p[i]>=p[j])
            {
             arr[i]=p[i]-p[j];
             flag=true;
             break;
            }
        }
        if(!flag)
        arr[i]=p[i];
      }  
      return arr;
    }
}