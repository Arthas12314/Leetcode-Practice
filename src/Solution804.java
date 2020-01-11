import java.util.TreeSet;

public class Solution804 {
    public int uniqueMorseRepresentations(String[] words){
        String[] map = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        TreeSet<String> res=new TreeSet<>();
        for(int i=0;i<words.length;i++){
            StringBuilder temp=new StringBuilder();
            for(int j=0;j<words[i].length();j++){
                temp.append(map[words[i].charAt(j)-'a']);
            }
            res.add(temp.toString());
        }
        return res.size();
    }
    public static void main(String[] args) {
        String[] words={"gin", "zen", "gig", "msg"};
        Solution804 t=new Solution804();
        System.out.println(t.uniqueMorseRepresentations(words));
    }
}
