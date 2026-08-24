class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] arr=new int[k];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int j=0;j<k;j++) {
            int max=0;
            int element=0;
            for (int i:map.keySet()) {
                if (map.get(i)>max) {
                    max=map.get(i);
                    element=i;
                }
            }
            arr[j]=element;
            map.remove(element);
        }
        return arr;
    }
}
