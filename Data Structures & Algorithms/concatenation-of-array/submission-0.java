class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] arr=new int[nums.length+nums.length];
        int right=0;
            for(int j=right;j<nums.length;j++){
                arr[j]=nums[j];
            }
        int left=nums.length;
        int j=0;
        while(left<arr.length&&j<nums.length){
            arr[left]=nums[j];

        left++;
        j++;
        }
        return arr;
    }
}