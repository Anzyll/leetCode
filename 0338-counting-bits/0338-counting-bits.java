class Solution {
    public int[] countBits(int n) {
        int[] dp = new int[n+1];
        int offSet = 1;
        for(int i=1; i<=n; i++){
            if(offSet*2 == i){
                offSet = i;
            }
            dp[i] = 1 + dp[i-offSet];
        }
        return dp;
    }
}