class Solution {

    public String getOrdered(String a)
    {
        char[] c=a.toCharArray();
        Arrays.sort(c);
        return new String(c);
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> m=new HashMap<>();
        for(String s:strs)
        {
            String o=getOrdered(s);
            if(m.containsKey(o))
            {
                m.get(o).add(s);
            }
            else
            {
                List<String> ls=new ArrayList<>();
                ls.add(s);
                m.put(o,ls);
            }
        }
        List<List<String>> ans=new ArrayList<>();
        for(String s:m.keySet())
        {
            ans.add(m.get(s));
        }
        return ans;
    }
}
