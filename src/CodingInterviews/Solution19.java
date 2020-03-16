package CodingInterviews;

class Solution19 {
    public boolean isMatch(String s, String p) {
        if (p.length() <= 0)
            return false;
        boolean match = (s.length() > 0 && (s.charAt(0) == p.charAt(0) || p.charAt(0) == '.'));
        if (p.length() > 1 && p.charAt(1) == '*'){
            return isMatch(s, p.substring(2)) || (match && isMatch(s.substring(1), p));
        } else {
            return match && isMatch(s.substring(1), p.substring(1));
        }
    }

    public static void main(String[] args) {
        Solution19 t=new Solution19();
        System.out.println(t.isMatch("aaa","aa*a"));//"mississippi","mis*is*ip*.""aab","c*a*b"
    }
}
