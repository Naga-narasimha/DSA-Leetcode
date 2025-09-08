class Solution {
    public int[] getNoZeroIntegers(int n) {
        int arr[]=new int[2];
        for(int i=1;i<n;i++)
        {
            int j=n-i;
            if(i<=9&&j<=9){
            arr[0]=i;
            arr[1]=j;
            return arr;
            }
           int k=i;
           int s=j;
           boolean flag=false;
           while(k!=0)
            {
            int rem=k%10;
            if(rem==0)
            flag=true;
            k=k/10;
            }
            while(s!=0)
            {
            int rem=s%10;
            if(rem==0)
            flag=true;
            s=s/10;
            }
            if(flag==false)
            {
                arr[0]=i;
                arr[1]=j;
                return arr;
            }
            else
            continue;
            
        }
        return arr;
    }
}