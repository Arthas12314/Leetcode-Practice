package utils;

public class LeetcodeParenthesesConvert {
    public static String convert(String text){
        StringBuilder res=new StringBuilder();
        for(int i=0;i<text.length();i++){
            if (text.charAt(i) == '[') {
                res.append('{');
            } else if (text.charAt(i) == ']') {
                res.append('}');
            } else if (text.charAt(i) == '\"') {
                res.append('\'');
            } else{
                res.append(text.charAt(i));
            }

        }
        return res.toString();
    }

    public static void main(String[] args) {
        String res=LeetcodeParenthesesConvert.convert("[1,3,1],[1,5,1],[4,2,1]");
        System.out.println(res);
    }
}
