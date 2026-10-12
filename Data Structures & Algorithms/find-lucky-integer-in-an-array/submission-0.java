public class Solution {
    public int findLucky(int[] arr) {
        int res=-1;
        for(int num:arr) {
            int count=0;
            for(int a:arr) {
                if(num==a) {
                    count++;
                }
            }
            if(count==num) {
                res=Math.max(res,num);
            }
        }
        return res;
    }
}