package CodingInterviews;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Arthas
 */
public class Solution38 {
    List<String> res=new LinkedList<>();
    public String[] permutation(String s) {
        char[] str=s.toCharArray();
        boolean[] visited=new boolean[s.length()];
        Arrays.sort(str);
        StringBuilder temp=new StringBuilder();
        bfs(str,visited,0,temp);
        return res.toArray(new String[res.size()]);
    }

    private void bfs(char[] str,boolean[] visited,int index,StringBuilder temp){
        if (temp.length() == str.length) {
            res.add(temp.toString());
            return;
        }
        for (int i = 0; i < str.length; i++) {
            if (i!=0 && str[i] == str[i-1] && visited[i-1]) {
                continue;
            }
            if (!visited[i]) {
                visited[i]=true;
                temp.append(str[i]);
                bfs(str,visited,i+1,temp);
                temp.deleteCharAt(temp.length()-1);
                visited[i]=false;
            }
        }
    }

    public static void main(String[] args) {
        Solution38 t=new Solution38();
        String[] res=t.permutation("aab");
        System.out.println(Arrays.toString(res));
    }
}
