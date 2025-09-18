class Solution {
    public int firstUniqChar(String s) {
      char arr[] = s.toCharArray();
      if(arr.length==1)
      return 0;
    HashMap<Character,Integer>m=new HashMap<>();
    for(char num:arr)
    {
        if(m.containsKey(num))
        {
            m.put(num,m.get(num)+1);
        }
        else
        m.put(num,1);
    }
    if(m.size()==1)
    {
        return -1;
    }
    int id=0;
    int count=0;
    for(int i=0;i<arr.length;i++)
    {
        if(m.get(arr[i])==1)
        {
       id= i;
       count++;
        break;
        }
    } 
    if(count==1)
    return id;
    else
    return -1;
       
    }
}