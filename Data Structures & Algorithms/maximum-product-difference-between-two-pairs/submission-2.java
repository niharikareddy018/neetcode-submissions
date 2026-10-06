class Solution {
    public int maxProductDifference(int[] nums) {
        int max=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
              if(i==j) continue;
                for(int k=0;k<nums.length;k++){
                    if(i==k||j==k) continue;
                    for(int l=0;l<nums.length;l++){
                        if(i==l||j==l||k==l) continue;
                     max=Math.max(max,nums[i]*nums[j]-nums[k]*nums[l]);
                    }
                }
            }
        }
        return max;
    }
}