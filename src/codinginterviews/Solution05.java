package codinginterviews;

public class Solution05 {
    public String replaceSpace(String s) {
        StringBuilder res=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if (s.charAt(i) != ' ') {
                res.append(s.charAt(i));
            } else {
                res.append("%20");
            }
        }
        return res.toString();
    }
}
