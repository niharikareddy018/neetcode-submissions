class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            for(int j=i+1;j<nums.length-1;j++){
                if(j>i+1 && nums[j]==nums[j-1]){
                    continue;
                }
                for(int k=j+1;k<nums.length;k++){
                    if(k>j+1 && nums[k]==nums[k-1]){
                        continue;
                    }
                int sum=nums[i]+nums[j]+nums[k];
                if(sum==0){
                    List<Integer> lt=new ArrayList<>();
                    lt.add(nums[i]);
                    lt.add(nums[j]);
                    lt.add(nums[k]);
                    list.add(lt);
                }

                    if(sum>0){
                        break;
                    }
                }
            }
        }
        return list;
    }
}

