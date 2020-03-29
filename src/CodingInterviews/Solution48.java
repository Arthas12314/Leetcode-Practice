package CodingInterviews;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @author Arthas
 */
public class Solution48 {
    public int lengthOfLongestSubstring(String s) {
        char[] str=s.toCharArray();
        if (str.length < 1) {
            return 0;
        }
        HashMap<Character,Integer> map=new HashMap<>();
        int i=0,j=0,res=0;
        while (j<str.length ) {
            if (map.containsKey(str[j])) {
                i=Math.max(map.get(str[j])+1,i);
            }
            res=Math.max(res,j-i+1);
            map.put(str[j], j);
            j++;
        }
        return res;
    }

    public static void main(String[] args) {
        Solution48 t=new Solution48();
        System.out.println(t.lengthOfLongestSubstring("bbbbb"));
    }
}
