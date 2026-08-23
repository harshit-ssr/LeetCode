class Solution {
    public int[] shuffle(int[] nums, int n) {
        int ans[] = new int[n*2];
        int j=n,i,k=0;
        for(i=0;i<n;i++)
        {
            ans[k++]=nums[i];
            ans[k++]=nums[j++];
        }
        return ans;
    }
}