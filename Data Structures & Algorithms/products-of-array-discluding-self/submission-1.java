class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] arr=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int num=1;
            for(int j=0;j<nums.length;j++){
                if(i!=j){
                    num=num*nums[j];
                }
            }
            arr[i]=num;
        }
        return arr;
    }
}  
