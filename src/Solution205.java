import java.util.HashMap;

public class Solution205 {
    public boolean isIsomorphic(String s, String t) {
        int len = s.length();
        for (int i = 0; i < len; i++) {
            //每次比较相同位置的字符第一次出现的位置
            if(s.indexOf(s.charAt(i)) != t.indexOf(t.charAt(i))){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution205 t=new Solution205();
        System.out.println(t.isIsomorphic("eggg","addd"));
    }
}
