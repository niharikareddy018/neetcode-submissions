class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        int count=1;
        int max=1;
        Set<Integer> set=new TreeSet<>();
        for(int num:nums){
            set.add(num);
        }
        int[] arr=set.stream().mapToInt(Integer::intValue).toArray();
        for(int i=1;i<arr.length;i++){
           if(arr[i]-arr[i-1]==1){
            count++;
           }else{
            count=1;
           }
           max=Math.max(max,count);
        }
        return max;
    }
}
