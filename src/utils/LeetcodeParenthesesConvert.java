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
        String res=LeetcodeParenthesesConvert.convert("[[1,2,3,4],[5,6,7,8],[9,10,11,12]]");
        System.out.println(res);
    }
}
