import java.util.*;
//sort-characters-by-frequency
public class Solution451 {

    class Pair{
        public char key;
        public int value;

        public Pair(char key, int value){
            this.key=key;
            this.value=value;
        }
    }

    public String frequencySort(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        StringBuilder res=new StringBuilder();
        ArrayList<Pair> list=new ArrayList<>();

        //统计频率，存入ArrayList
        for(char c:s.toCharArray()){
            map.putIfAbsent(c,0);
            map.computeIfPresent(c,(k,v)->v+1);
        }
        for(char c: map.keySet()){
            list.add(new Pair(c,map.get(c)));
        }

        //按出现频率排序后再按字典序
        list.sort((o1, o2) -> {
            if (o1.value != o2.value)
                return Integer.compare(o1.value, o2.value);
            else
                return Character.compare(o2.key, o1.key);
        });
        //拼接字符串
        for(Pair p:list){
            //res.append(String.valueOf(p.key).repeat(Math.max(0, p.value)));
        }
        return res.reverse().toString();
    }

    public static void main(String[] args) {
        Solution451 t=new Solution451();
        System.out.println(t.frequencySort("abdcadgae"));
    }
}
