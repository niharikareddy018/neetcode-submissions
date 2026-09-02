class Solution {
    public int removeDuplicates(int[] nums) {
        int left=0;
        int right=0;
        while(right<nums.length){
            nums[left]=nums[right];
            while(right<nums.length && nums[right]==nums[left]){
                right++;
            }
         left++;
        }
        return left;
    }
}