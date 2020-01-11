import java.util.*;

public class WordDictionary211 {
    /*private Node root;
    private class Node{
        boolean isWord;
        TreeMap<Character, Node> next;
        public Node(boolean isWord) {
            this.isWord = isWord;
            next = new TreeMap<>();
        }
        public Node() {
            this(false);
        }
    }
    public WordDictionary211(){
        root=new Node();
    }
    public void addWord(String word){
        Node cur=root;
        for(int i=0;i<word.length();i++){
            char c=word.charAt(i);
            if(cur.next.get(c)==null)
                cur.next.put(c,new Node());
            cur=cur.next.get(c);
        }
        cur.isWord=true;
    }
    public boolean search(String word){
        return match(root,word,0);
    }

    private boolean match(Node node,String word,int index){
        if(index==word.length())
            return node.isWord;
        char c=word.charAt(index);
        if(c!='.'){
            if(node.next.get(c)==null)
                return false;
            return match(node.next.get(c),word,index+1);
        }
        else {
            for(char nextChar:node.next.keySet()){
                if(match(node.next.get(nextChar),word,index+1))
                    return true;
            }
            return false;
        }
    }*/
    Map<Integer,Set<String>> map = new HashMap<>();//根据字符串长度分开存放
    public WordDictionary211() {

    }
    public void addWord(String word) {
        int length = word.length();
        if(map.get(length)!=null){
            map.get(length).add(word);
        }else{
            Set<String> set = new HashSet<>();
            set.add(word);
            map.put(length, set);
        }
    }
    public boolean search(String word) {
        Set<String> set = map.get(word.length());
        if(set==null){  //不存在该长度的字符串，直接返回false；
            return false;
        }
        if(set.contains(word)) return true;
        char[] chars = word.toCharArray();
        P:for(String s : set){
            if(word.length()!=s.length()){
                continue;
            }
            char[] cs = s.toCharArray();
            for(int i = 0; i< cs.length; i++){//逐个字符对比
                if(chars[i] != '.' && chars[i] != cs[i]){
                    continue P;
                }
            }
            set.add(word);
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        WordDictionary211 t=new WordDictionary211();
        t.addWord("bad");
        t.addWord("dad");
        t.addWord("mad");
        System.out.println(t.search("pad"));
        System.out.println(t.search("bad"));
        System.out.println(t.search(".ad"));
        System.out.println(t.search("b.."));
    }
}
