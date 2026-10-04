class Solution {
    public int rob(int[] nums) {
        int[] dp=new int[nums.length];
        Arrays.fill(dp,0);
        dp[0]=nums[0];
        for(int i=2;i<nums.length;i=i+2){
            dp[i]=dp[i-2]+nums[i];
        }
        for(int i=3;i<nums.length;i=i+2){
            dp[i]=dp[i-2]+nums[i];
        }
        return Math.max(dp[nums.length-1],dp[nums.length-2]);
    }
}
