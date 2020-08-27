import java.util.ArrayList;
import java.util.List;

/**
 * @author Arthas
 */
public class Solution17 {
    private String[] letterMap = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    private List<String> result = new ArrayList<>();

    public List<String> letterCombinations(String digits) {
        if (digits.isEmpty()) {
            return result;
        }
        dfs(digits, "", 0);
        return result;
    }

    private void dfs(String digits, String singleResult, int index) {
        if (index == digits.length()) {
            result.add(singleResult);
            return;
        }
        String temp = letterMap[digits.charAt(index) - '2'];
        for (int i = 0; i < temp.length(); i++) {
            dfs(digits, singleResult + temp.charAt(i), index + 1);
        }
    }

    public static void main(String[] args) {
        Solution17 t = new Solution17();
        System.out.println(t.letterCombinations("23"));
    }
}
