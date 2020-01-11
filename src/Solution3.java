import java.util.HashMap;

public class Solution3 {
    public int lengthOfLongestSubstring(String s){
        /*int res=0;
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0,j=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i)))
                j=Math.max(map.get(s.charAt(i)),j);
            res=Math.max(i-j+1,res);
            map.put(s.charAt(i),i+1);
        }
        return res;*/
        /*int i=0,j=-1,res=0;
        HashMap<Character,Integer> map=new HashMap<>();
        while(i<s.length()){
            if(j+1<s.length() && !map.containsKey(s.charAt(j+1))){
                j++;
                map.put(s.charAt(j),1);
            }
            else {
                map.remove(s.charAt(i));
                i++;
            }
            res=Math.max(res,j-i+1);
        }
        return res;*/
        int maxLength = 0;
        char[] chars = s.toCharArray();
        int leftIndex = 0;
        for (int j = 0; j < chars.length; j++) {
            for (int innerIndex = leftIndex; innerIndex < j; innerIndex++) {
                if (chars[innerIndex] == chars[j]) {
                    maxLength = Math.max(maxLength, j - leftIndex);
                    leftIndex = innerIndex + 1;
                    break;
                }
            }
        }
        return Math.max(chars.length - leftIndex, maxLength);
    }

    public static void main(String[] args) {
        String s="efkew";
        Solution3 t=new Solution3();
        double startTime=System.nanoTime();
        int res=t.lengthOfLongestSubstring(s);
        double endTime=System.nanoTime();
        System.out.println(res+" time: "+(endTime-startTime)/1000000+" ms");
    }
}
