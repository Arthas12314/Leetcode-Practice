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
        String res = LeetcodeParenthesesConvert.convert("[\n" +
                "  [1,   4,  7, 11, 15],\n" +
                "  [2,   5,  8, 12, 19],\n" +
                "  [3,   6,  9, 16, 22],\n" +
                "  [10, 13, 14, 17, 24],\n" +
                "  [18, 21, 23, 26, 30]\n" +
                "]\n");
        System.out.println(res);
    }
}
