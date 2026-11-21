class Solution {
    public int[] productExceptSelf(int[] nums) {
        int l=nums.length;
        int[] left=new int[l];
        int[] right=new int[l];
        int ls=1;int rs=1;
        for(int i=0;i<l;i++)
        {
            ls=ls*nums[i];
            rs=rs*nums[l-i-1];
            left[i]=ls;
            right[l-i-1]=rs;
        }
        int[] ans=new int[l];
        for(int i=0;i<l;i++)
        {
            if(i==0)
            {
                ans[i]=right[i+1];
            }
            else if(i==l-1)
            {
                ans[i]=left[i-1];
            }
            else{
                ans[i]=left[i-1]*right[i+1];
            }
        }
        return ans;
    }
}  
