import java.util.Stack;

/**
 * @description:
 * @author: Kevin Arthas
 * @date: 2020/9/5
 * @time: 17:28
 */
public class Solution32 {
    public int longestValidParentheses(String s) {
        Stack<Integer> inValidParenthesis = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ')' && !inValidParenthesis.isEmpty() && s.charAt(inValidParenthesis.peek()) == '(') {
                inValidParenthesis.pop();
            } else {
                inValidParenthesis.push(i);
            }
        }
        inValidParenthesis.push(s.length());
        int result = inValidParenthesis.get(0);
        for (int i = 1; i < inValidParenthesis.size(); i++) {
            result = Math.max(inValidParenthesis.get(i) - inValidParenthesis.get(i - 1) - 1, result);
        }
        return result;
    }

    public static void main(String[] args) {
        Solution32 t = new Solution32();
        System.out.println(t.longestValidParentheses(")()(()()"));
    }
}
