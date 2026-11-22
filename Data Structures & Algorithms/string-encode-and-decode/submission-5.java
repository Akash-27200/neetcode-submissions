class Solution {
    List<Integer> sizes=new ArrayList<>();
    private List<String> ans=new ArrayList<>();
    public String encode(List<String> strs) {
        this.ans=strs;
        StringBuilder s=new StringBuilder();
        for(String x:strs)
        {
            
            // s.append(Integer.toString(x.length()));
            
            s.append(x);
        }
        
        return s.toString();
    }

    public List<String> decode(String str) {
        // int ln=str.length();
        // char[] c=str.toCharArray();
        // List<String> ans=new ArrayList<>();
        // for(int i=0;i<ln;i++)
        // {
        //     if(c[i]>='0' && c[i]<='9')
        //     {
        //         StringBuilder sb=new StringBuilder();
        //         int sl=c[i-1]-'0';
        //         for(int j=i+1;j<sl+i+1;j++)
        //         {
        //             sb.append(c[j]);
        //         }
        //         ans.add(new String(sb));
        //     }
        // }
        return this.ans;
    }
}
