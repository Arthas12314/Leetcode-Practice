import java.util.LinkedList;

public class Solution20 {
    public boolean isValid(String s){
        LinkedList<Character> list=new LinkedList<>();
        for(int i=0;i<s.length();i++){
            char temp=s.charAt(i),c;
            if(temp=='(' || temp=='[' || temp=='{'){
                list.add(temp);
            }
            else {
                if(list.isEmpty())
                    return false;
                switch (temp){
                    case ')':
                        if(list.peek()!='(')
                            return false;
                        break;
                    case ']':
                        if(list.peek()!='[')
                            return false;
                        break;
                    case '}':
                        if(list.peek()!='{')
                            return false;
                        break;
                    default:
                        break;
                }
            }
        }
        return list.isEmpty();
    }
}
