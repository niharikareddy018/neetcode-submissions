class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int count=0;
        for(int i=0;i<text2.length();i++){
            for(int j=0;j<text2.length();j++){
            if(text1.charAt(i)==text2.charAt(j)){
                count++;
            }
            }
            if(text1.contains(text2)){
                return text1.length();
            }else{
                return 0;
            }
        }
        return count;
    }
}
