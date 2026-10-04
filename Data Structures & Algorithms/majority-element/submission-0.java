class Solution {
    public int majorityElement(int[] nums) {
        int max=nums[0];
        int count=1;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                    max=nums[i];
                }
            }
        }
        return max;
    }
}