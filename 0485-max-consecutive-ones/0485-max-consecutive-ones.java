class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0, max=count;
        for(int i=0;i<nums.length;i++)
        {
            count = 0;
            while(i<nums.length && nums[i]==1)
            {
                count++;
                i++;
            }
            max=(max>count)?max:count;
        }
        return max;
    }
}