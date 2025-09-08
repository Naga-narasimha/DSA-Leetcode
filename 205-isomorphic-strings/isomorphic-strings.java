class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character,Character>m=new HashMap<>();
        Map<Character,Character>m1=new HashMap<>();
      if(s.length()!=t.length())
      return false;
      for(int i=0;i<s.length();i++)
      {
        char ch=s.charAt(i);
        char ch2=t.charAt(i);
        if(m.containsKey(ch))
        {
            if(m.get(ch)!=ch2)
            return false;
            else
            m.put(ch,ch2);
        }
        else
        m.put(ch,ch2);
        if(m1.containsKey(ch2))
        {
            if(m1.get(ch2)!=ch)
            return false;
            else
            m1.put(ch2,ch);
        }
        else
        m1.put(ch2,ch);
      }
      return true;
    }
}