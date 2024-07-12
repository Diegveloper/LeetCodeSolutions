package ozomahtli;

public class ClimbingStairs {
    //This is solved by memoization basically is how many ways can i do it, the next step will be based on the previous solution.
    public int climbStairs(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= n; ++i)
            dp[i] = dp[i - 1] + dp[i - 2];

        return dp[n];
    }
}
