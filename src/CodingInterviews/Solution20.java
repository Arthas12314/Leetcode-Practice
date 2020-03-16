package CodingInterviews;

public class Solution20 {
    //未完成一些脑洞大开的神经用例
    public boolean isNumber(String s) {
        char[] str=s.trim().toCharArray();
        if(str.length<1)
            return false;
        int i=0,mark1=0,mark2=0;
        if(str[i]=='+' || str[i]=='-')
            i++;
        if(!Character.isDigit(str[i])){
            return false;
        }
        for(;i<str.length;i++){
            if(mark1>1 || mark2>1)
                return false;
            if(!Character.isDigit(str[i])){
                if(str[i]==' ')
                    continue;
                if((str[i]=='e' || str[i]=='E') && i>0 && i!=str.length-1 && Character.isDigit(str[i-1])){
                    if(str[i+1]=='-' && i+1!=str.length-1){
                        i++;
                    }
                    mark1++;
                    continue;
                }
                if(str[i]=='.' && i>0 && i<str.length-1){
                    mark2++;
                    continue;
                }
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution20 t=new Solution20();
        System.out.println(t.isNumber("1 "));
    }
}
