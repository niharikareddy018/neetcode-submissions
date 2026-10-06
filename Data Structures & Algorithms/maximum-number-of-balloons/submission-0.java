class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch:text.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        Map<Character,Integer> balloon = new HashMap<>();
        for (char ch : "balloon".toCharArray()) {
            balloon.put(ch, balloon.getOrDefault(ch,0) + 1);
        }
        int res=text.length();
        for(char ch:balloon.keySet()){
            res=Math.min(res,map.getOrDefault(ch,0)/balloon.get(ch));
        }
        return res;
    }
}