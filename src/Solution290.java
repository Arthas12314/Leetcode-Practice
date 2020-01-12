import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
//与Solution205同类型
public class Solution290 {
    public boolean wordPattern(String pattern, String str) {
        if(pattern.isEmpty() || str.isEmpty())
            return false;

        char[] s1=pattern.toCharArray();
        String[] s2=str.split(" ");
        HashMap<String,Integer> map=new HashMap<>();

        if(s1.length!=s2.length)
            return false;

        for(int i=0;i<s2.length;i++){
            map.putIfAbsent(s2[i],i);
        }
        for(int i=0;i<s1.length;i++){
            if(pattern.indexOf(s1[i])!=map.get(s2[i]))
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Solution290 t=new Solution290();
        System.out.println(t.wordPattern("abbb","dog cat cat cat"));
    }
}
