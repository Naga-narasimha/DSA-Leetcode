class Solution {
    public String decodeMessage(String key, String message) {
      Set<Character>s=new LinkedHashSet<>();    
        for(char ch:key.toCharArray())
        { 
            if(ch!=' ')
            s.add(ch);
        }

     List<Character> list = new ArrayList<>(s);
     HashMap<Character,Character>m=new HashMap<>();
     for(int i=0;i<26;i++)
     {
        m.put(list.get(i),(char)('a'+i));
     } 
     StringBuilder sb=new StringBuilder();
     for(char ch:message.toCharArray())
     {
         if(ch==' ')
         sb.append(' ');
        else{
         sb.append(m.get(ch));
         }
     }
     return sb.toString();
    }
}