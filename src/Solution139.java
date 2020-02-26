import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution139 {
    //优秀题解
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] v = new boolean[s.length()+1];
        return recursive(s, 0, wordDict, v);
    }

    public boolean recursive(String s, int start, List<String> wordDict, boolean[] v){
        v[start] = true;
        for(int i = start; i < s.length(); i++){
            if(v[i + 1]) continue;
            if(wordDict.contains(s.substring(start,i+1))){
                if(i + 1 == s.length() || recursive(s,i+1, wordDict, v))
                    return true;
            }
        }
        return false;
    }
    /*public boolean wordBreak(String s, List<String> wordDict) {
        int len=s.length();
        boolean[] dp=new boolean[len+1];
        dp[0]=true;
        for(int i=1;i<len+1;i++){
            for(int j=0;j<i;j++){
                if (dp[j] && wordDict.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[len];
    }*/
    public static void main(String[] args) {
        String s="aaaaaaa";
        List<String> wordDict=new ArrayList<>();
        wordDict.add("aaaa");
        wordDict.add("aaa");
        Solution139 t=new Solution139();
        System.out.println(t.wordBreak(s,wordDict));
    }
}
