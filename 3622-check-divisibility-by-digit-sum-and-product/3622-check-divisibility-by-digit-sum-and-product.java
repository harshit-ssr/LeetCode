class Solution {
    public boolean checkDivisibility(int n) {
        int digit_sum=0,digit_prod=1,copy=n;
        while(n!=0){
            int d= n%10;
            digit_sum+=d;
            digit_prod*=d;
            n=n/10;
        }
        if(copy % (digit_sum+digit_prod)==0)
            return true;
        else 
            return false;
    }
}