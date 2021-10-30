import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution500 {
    private static final String[] keyboardLine = new String[]{"qwertyuiop","asdfghjkl","zxcvbnm"};
    public String[] findWords(String[] words) {
        int matchLineIndex = 0;
        List<String> matchStrList = new LinkedList<>();
        String lowerCaseWord;
        for (int i = 0; i < words.length; i++) {
            lowerCaseWord = words[i].toLowerCase();
            matchLineIndex = judgeLineIndex(lowerCaseWord.charAt(0));
            matchStrList.add(words[i]);
            for (int j = 1; j < lowerCaseWord.length(); j++) {
                if (keyboardLine[matchLineIndex].indexOf(lowerCaseWord.charAt(j)) == -1) {
                    matchStrList.remove(matchStrList.size()-1);
                    break;
                }
            }
        }
        String[] res = new String[matchStrList.size()];
        for (int i = 0; i < matchStrList.size(); i++) {
            res[i]=matchStrList.get(i);
        }
        return res;
    }

    private int judgeLineIndex(char c) {
        if (keyboardLine[0].indexOf(c)!=-1) {
            return 0;
        }
        if (keyboardLine[1].indexOf(c)!=-1) {
            return 1;
        }
        return 2;
    }

    public static void main(String[] args) {
        String[] words = new String[]{"Hello","Alaska","Dad","Peace"};
        Solution500 solution500 = new Solution500();
        String[] res = solution500.findWords(words);
        System.out.println(Arrays.toString(res));
    }
}
