class Solution {
    public int heightChecker(int[] heights) {
        int count=0;
        int[] height=new int[heights.length];
        for(int i=0;i<heights.length;i++){
            height[i]=heights[i];
        }
        Arrays.sort(height);
        for(int i=0;i<heights.length;i++){
            if(heights[i]!=height[i]){
                count++;
            }
        }
        return count;
    }
}