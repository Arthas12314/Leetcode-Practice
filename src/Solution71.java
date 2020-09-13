import java.util.Deque;
import java.util.LinkedList;

/**
 * @description:
 * @author: Kevin Arthas
 * @date: 2020/9/13
 * @time: 0:18
 */
public class Solution71 {
    public String simplifyPath(String path) {
        Deque<String> deque = new LinkedList<>();
        for (String s : path.split("/")) {
            if ("..".equals(s)) {
                if (!deque.isEmpty()) {
                    deque.pop();
                }
            } else if (!s.isEmpty() && !".".equals(s)) {
                deque.push(s);
            }
        }

        StringBuilder res = new StringBuilder();
        for (String s : deque) {
            res.insert(0, s).insert(0, "/");
        }
        return res.length() == 0 ? "/" : res.toString();
    }
}
