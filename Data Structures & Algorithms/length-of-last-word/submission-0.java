class Solution {
    public int lengthOfLastWord(String s) {
        String[] str=s.split(" ");
        int lastword=str[str.length-1].length();
        return lastword;
    }
}