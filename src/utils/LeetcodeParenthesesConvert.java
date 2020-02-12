package utils;

public class LeetcodeParenthesesConvert {
    public static String convert(String text){
        StringBuilder res=new StringBuilder();
        for(int i=0;i<text.length();i++){
            if(text.charAt(i)=='[')
                res.append('{');
            else if(text.charAt(i)==']')
                res.append('}');
            else
                res.append(text.charAt(i));
        }
        return res.toString();
    }

    public static void main(String[] args) {
        String res=LeetcodeParenthesesConvert.convert("[[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]]");
        System.out.println(res);
    }
}
