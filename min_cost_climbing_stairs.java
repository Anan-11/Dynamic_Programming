//https://leetcode.com/problems/min-cost-climbing-stairs/


class Solution {
    
    
    
    //TC:O(n)    SC:O(n)
    public int helper(int[] cost,int n,int[] dp)   //recursion + memoization(top down)
    {
        if(n<2)
        {
            dp[n]=cost[n];
            return dp[n];
    }
        
        if(dp[n]==-1)
        {
        int ans=cost[n]+Math.min(helper(cost,n-1,dp),helper(cost,n-2,dp));
        dp[n]=ans;
    }
        return dp[n];
    }
    
    
    
    
    
    
    
     //TC:O(n)    SC:O(n)
    public int helper2(int[] cost,int[] dp,int n)     //recursion + tabulation(bottom up)      B
    {
        
        for(int i=2;i<n;i++)
        {
            dp[i]=cost[i]+ Math.min(dp[i-1],dp[i-2]);
        }
        
        return Math.min(dp[n-1],dp[n-2]);
        
        
        
    }
    
    
    
    
    
    
    //TC: O(n)   SC:O(1)
   public int helper3(int[] cost,int n)                         //BEST APPROACH
    {
        int prev2=cost[0];
        int prev1=cost[1];
        for(int i=2;i<n;i++)
        {
            int ans=cost[i] + Math.min(prev1,prev2);
            prev2=prev1;
            prev1=ans;
        }
        return Math.min(prev1,prev2);
    }
    
    
    
    
    
    
    
    public int minCostClimbingStairs(int[] cost) {
//         int n=cost.length;      //     recursion+memoization
//         int[] dp=new int[n+1];
        
//         for(int i=0;i<=n;i++)
//         {
//             dp[i]=-1;
//         }
        
//         int ans=Math.min(helper(cost,cost.length-1,dp),helper(cost,cost.length-2,dp));
//         return ans;
        
        
        
        
        
        
//         int n=cost.length;                 //recursion + tabulation
//         int[] dp=new int[n+1];
//         dp[0]=cost[0];
//         dp[1]=cost[1];
        
//         int ans=helper2(cost,dp,n);
//         return ans;
        
        
        
        
        
        int n=cost.length;    //O(1) SC approach
        int ans=helper3(cost,n);
        return ans;
        
        
    }
        
        
    
}
