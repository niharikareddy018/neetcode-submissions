class Solution {
    public int scoreOfString(String s) {
        char[] ch=s.toCharArray();
        int temp=0;
       for(int i=1;i<ch.length;i++){
        temp=temp+Math.abs(ch[i]-ch[i-1]);
       }
       return temp;
    }
}