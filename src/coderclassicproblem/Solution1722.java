package coderclassicproblem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution1722 {
    private List<String> result = new ArrayList<>();
    
    private List<String> dictList;
    
    private String endWord;
    
    public List<String> findLadders(String beginWord, String endWord, List<String> wordList) {
        dictList = wordList;
        this.endWord = endWord;
        boolean[] stepRecord = new boolean[wordList.size()];
        dfs(beginWord, stepRecord, new ArrayList<String>() {{
                add(beginWord);
            }});
        return result;
    }
    
    public boolean dfs(String beginWord, boolean[] stepRecord, List<String> processList) {
        if (!dictList.contains(endWord)) {
            return false;
        }
        if (beginWord.equals(endWord)) {
            result = new ArrayList<>(processList);
            return true;
        }
        for (int i = 0; i < dictList.size(); i++) {
            String temp = dictList.get(i);
            if (!stepRecord[i] && canTransfer(beginWord, temp)) {
                stepRecord[i] = true;
                processList.add(temp);
                if (dfs(temp, stepRecord, processList)) {
                    return true;
                }
                processList.remove(processList.size() - 1);
            }
        }
        return false;
    }
    
    private boolean canTransfer(String beginWord, String endWord) {
        int diffCount = 0;
        for (int i = 0; i < beginWord.length(); i++) {
            if (beginWord.charAt(i) != endWord.charAt(i)) {
                diffCount++;
            }
            if (diffCount > 1) {
                return false;
            }
        }
        return diffCount == 1;
    }
    
    public static void main(String[] args) {
        Solution1722 solution1722 = new Solution1722();
        System.out.println(solution1722.findLadders("qa",
            "sq",
            Arrays.asList(new String[] {"si","go","se","cm","so","ph","mt","db","mb","sb","kr","ln","tm","le","av","sm","ar","ci","ca","br","ti","ba","to","ra","fa","yo","ow","sn","ya","cr","po","fe","ho","ma","re","or","rn","au","ur","rh","sr","tc","lt","lo","as","fr","nb","yb","if","pb","ge","th","pm","rb","sh","co","ga","li","ha","hz","no","bi","di","hi","qa","pi","os","uh","wm","an","me","mo","na","la","st","er","sc","ne","mn","mi","am","ex","pt","io","be","fm","ta","tb","ni","mr","pa","he","lr","sq","ye"})));
    }
}
