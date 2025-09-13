class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character,Integer>m=new HashMap<>();
        int min=0;
        int max=0;
        for(char ch:s.toCharArray())
        {
            m.put(ch,m.getOrDefault(ch,0)+1);
        }
        for(char key:m.keySet())
        {
           if(key=='a'||key=='e'||key=='i'||key=='o'||key=='u')
           {
            if(m.get(key)>min)
            min=m.get(key);
           }
           else
           {
            if(m.get(key)>max)
            max=m.get(key);
           }
        }
      return min+max;  
    }
}