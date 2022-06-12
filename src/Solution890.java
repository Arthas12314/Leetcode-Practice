import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution890 {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        Map<Character, Character> words2PatternMap = new HashMap<>();
        Map<Character, Character> pattern2WordsMap = new HashMap<>();
        List<String> res = new ArrayList<>();
        char[] patternCharArray = pattern.toCharArray();
        for (int i = 0; i < words.length; i++) {
            boolean mark = true;
            for (int j = 0; j < patternCharArray.length; j++) {
                char c = words[i].charAt(j);
                if (words2PatternMap.containsKey(c)) {
                    if (!words2PatternMap.get(c).equals(patternCharArray[j])) {
                        mark = false;
                    }
                }
                if (pattern2WordsMap.containsKey(patternCharArray[j])) {
                    if (!pattern2WordsMap.get(patternCharArray[j]).equals(c)) {
                        mark = false;
                    }
                }
                else {
                    words2PatternMap.put(c, patternCharArray[j]);
                    pattern2WordsMap.put(patternCharArray[j],c);
                }
            }
            if (mark) {
                res.add(words[i]);
            }
            words2PatternMap.clear();
            pattern2WordsMap.clear();
        }
        return res;
    }

    public static void main(String[] args) {
        Solution890 solution890 = new Solution890();
        String[] words = new String[]{"abc","deq","mee","aqq","dkd","ccc"};
        System.out.println(solution890.findAndReplacePattern(words,"abb"));
    }
}
