class Solution {
    public boolean checkDistances(String s, int[] d) {
        int count=0;
        HashSet<Character>set=new HashSet();
        for(char ch:s.toCharArray())
        set.add(ch);
     for(int i=0;i<s.length();i++)
     {
        for(int j=i+1;j<s.length();j++)
        {
           if(s.charAt(i)==s.charAt(j))
           {
            int sum=0;
            sum=j-i-1;
            int index=s.charAt(i)-'a';
            if(sum==d[index])
            {
                count++;
            }
           }
        }
     } 
     if(count==set.size())
     return true;
     else
     return false;  
    }
}