class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    ArrayList<Integer>l=new ArrayList<>();
    for(int num:nums1)
    {
        l.add(num);
    }
    for(int num1:nums2)
    {
        l.add(num1);
    }
    int arr[]=new int[l.size()];
    for(int i=0;i<l.size();i++)
    {
        arr[i]=l.get(i);
    }
    Arrays.sort(arr);
    int n=arr.length;
    if(n%2!=0)
    return (double)(arr[n/2]);
    else
       return ((arr[n/2]+arr[n/2-1])/2.0);
    }
}