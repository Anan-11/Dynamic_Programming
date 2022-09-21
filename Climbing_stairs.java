//https://leetcode.com/problems/climbing-stairs/submissions/

//DP+MEMOIZATION      TC: O(n)  SC: O(n)
class Solution {
    
    public int helper(int level,int n,Map <Integer,Integer> map)
    {
        if(level==n)
            return 1;
        if(level>n)
        return 0;
        
        if(map.containsKey(level))
        {
            return map.get(level);
        }
        else{
        
        int one=helper(level+1,n,map); 
        int two=helper(level+2,n,map);
        map.put(level,one+two);
        return one + two;
    }
        // return map.get(0);
        
    }
    
    public int climbStairs(int n) {
        Map <Integer,Integer> map=new HashMap <>();
        // map.put(0,0);
        // map.put(1,1);
        int ans=helper(0,n,map);
        return ans;
    }
}



MOST OPTIMIZED  // TC: O(n)   SC:O(1)

class Solution {                                     
    public int climbStairs(int n) {
        int[] dp=new int[n+1];
        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<=n;i++)
        {
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
        
    }
}
















