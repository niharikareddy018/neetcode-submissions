class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            for(int j=i+1;j<nums.length-1;j++){
                for(int k=j+1;k<nums.length;k++){
                int sum=nums[i]+nums[j]+nums[k];
                if(sum==0){
                    List<Integer> lt=new ArrayList<>();
                    lt.add(nums[i]);
                    lt.add(nums[j]);
                    lt.add(nums[k]);

                    Collections.sort(lt);
                    if(!list.contains(lt))
                       list.add(lt);
                    }
                }
            }
        }
        return list;
    }
}
