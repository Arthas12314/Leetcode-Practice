import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: Kevin Arthas
 * @date: 2020/9/18
 * @time: 22:21
 */
public class Solution93 {
    private List<String> res;

    public List<String> restoreIpAddresses(String s) {
        res = new ArrayList<>();
        if (s.length() < 4) {
            return res;
        }
        StringBuilder temp = new StringBuilder();
        getIp(s, temp, 0, 0);
        return res;
    }

    private void getIp(String s, StringBuilder temp, int index, int countDot) {
        if (countDot > 4) {
            return;
        }
        if (index == s.length() && countDot == 4) {
            res.add(temp.substring(1));
            return;
        }
        String str;
        for (int i = index; i < s.length() && i - index < 3; i++) {
            str = s.substring(index, i + 1);
            if (str.charAt(0) == '0' && str.length() > 1) {
                return;
            }
            if (Integer.parseInt(str) < 256) {
                temp.append('.').append(str);
                getIp(s, temp, i + 1, countDot + 1);
                temp.delete(temp.lastIndexOf("."), temp.length());
            }
        }
    }
}
