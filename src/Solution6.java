import java.util.Arrays;

/**
 * @author Arthas
 */
public class Solution6 {
    public String convert(String s, int numRows) {
        if (numRows <= 1 || s.length() <= numRows) {
            return s;
        }
        StringBuilder res=new StringBuilder();
        boolean mark=false;
        String[] temp=new String[numRows];
        Arrays.fill(temp, "");
        for (int i = 0,j=0; i < s.length(); i++) {
            if (j == numRows - 1) {
                mark=true;
            }
            if (j == 0) {
                mark=false;
            }
            if (mark) {
                temp[j++]+=s.charAt(i);
            } else {
                temp[j--]+=s.charAt(i);
            }
        }
        for (String str : temp) {
            res.append(str);
        }
        return res.toString();
    }

    public static void main(String[] args) {
        Solution6 t=new Solution6();
        System.out.println(t.convert("PAYPALISHIRING",3));
    }
}
