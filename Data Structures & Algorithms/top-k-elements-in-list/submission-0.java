class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> m=new HashMap<>();
        for(int i:nums)
        {
            if(m.containsKey(i))
            {
                m.put(i,m.get(i)+1);
            }
            else{
                m.put(i,1);
            }
        }
        Integer[] un=m.keySet().toArray(new Integer[m.size()]);
        Arrays.sort(un,(a,b)->Integer.compare(m.get(b),m.get(a)));
        int[] ans=new int[k];
        for(int i=0;i<k;i++)
        {
            ans[i]=un[i];
        }
        return ans;
    }
}
