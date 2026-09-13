class Solution {
    public int reverse(int x) {
        String s = Integer.toString(x);
        if (s.charAt(0) == '-') {
            StringBuilder sb = new StringBuilder(s.substring(1));
            try {
                return -Integer.parseInt(sb.reverse().toString());
            } catch (NumberFormatException e) {
                return 0;
            }
        }
        StringBuilder sb = new StringBuilder(s);
        try {
            return Integer.parseInt(sb.reverse().toString());
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}
