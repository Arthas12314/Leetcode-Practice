import java.util.HashMap;

public class Solution242 {
    public boolean isAnagram(String s, String t) {
        //Hashmap实现
        HashMap<Character,Integer> map=new HashMap<>();
        char[] s1=s.toCharArray();
        char[] s2=t.toCharArray();
        for(char c:s1){
            if(!map.containsKey(c))
                map.put(c,1);
            else
                map.put(c,map.get(c)+1);
        }
        for(char c:s2){
            if(map.containsKey(c)){
                map.put(c,map.get(c)-1);
                if(map.get(c)==0)
                    map.remove(c);
            }
            else
                return false;
        }
        return map.isEmpty();
    }
}
