//https://leetcode.com/problems/coin-change/

class Solution {                                          //most optimized     TC:O(n ^ 2)        SC:O(n)
    public int coinChange(int[] coins, int amount) {
        if(amount==0)
            return 0;
        
        int[] dp=new int[amount+1];
        for(int i=1;i<dp.length;i++)
        {
            dp[i]=amount+1;
        }
        dp[0]=0;
        for(int i=1;i<dp.length;i++)
        {
            for(int j=0;j<coins.length;j++)
            {
                if(coins[j]<=i)
                {
                    dp[i]=Math.min(dp[i],dp[i-coins[j]]+1);
                }
            }
        }
        int ans=dp[amount];
        if(ans==amount+1)
            return -1;
        return ans;
        
        
    }
}
