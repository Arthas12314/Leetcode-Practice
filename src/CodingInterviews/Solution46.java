package CodingInterviews;

/**
 * @author Arthas
 */
public class Solution46 {
    int res=0;
    public int translateNum(int num) {
        char[] str=String.valueOf(num).toCharArray();
        dfs(str,0);
        return res;
    }

    private void dfs(char[] str,int index){
        if (index==str.length) {
            res++;
            return;
        }
        dfs(str,index+1);
        if (index < str.length - 1 && test(str, index)) {
            dfs(str,index+2);
        }
    }

    private boolean test(char[] str,int index){
        return str[index] - '0' == 1 || (str[index] - '0' == 2 && str[index + 1] - '0' < 6);
    }

    public static void main(String[] args) {
        Solution46 t=new Solution46();
        System.out.println(t.translateNum(11258));
    }
}
