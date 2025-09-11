class Solution {
    public String convertToBase7(int num) {
    boolean flag=false;
    if(num==0)
    return "0";
    if(num<0)
    {
        flag=true;
    } 
    num=Math.abs(num);
    StringBuilder sb=new StringBuilder();
    while(num!=0)
    {
        int rem=num%7;
        sb.append(rem);
        num=num/7;
    } 
    if(flag)
    {
        sb.append('-');
    } 
    return sb.reverse().toString();
    }
}