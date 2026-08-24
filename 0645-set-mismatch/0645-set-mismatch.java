class Solution {
    public int[] findErrorNums(int[] nums) {
        int n=nums.length, dup=-1,miss=-1;
        int count[] = new int[n+1];
        for(int num:nums)
            count[num]++;
        for(int i=1;i<=n;i++)
        {
            if(count[i]==2)
                dup=i;
            if(count[i]==0)
                miss=i;
        }
        return new int[]{dup,miss};
    }
}