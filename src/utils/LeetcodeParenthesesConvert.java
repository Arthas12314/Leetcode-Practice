package utils;

/**
 * @author Arthas
 */
public class LeetcodeParenthesesConvert {
    public static String convert(String text){
        StringBuilder res=new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == '[') {
                res.append('{');
            } else if (text.charAt(i) == ']') {
                res.append('}');
            } else if (text.charAt(i) == '\"') {
                res.append('\'');
            } else {
                res.append(text.charAt(i));
            }

        }
        return res.toString();
    }

    public static void main(String[] args) {
        String res = LeetcodeParenthesesConvert.convert("[[\"MUC\",\"LHR\"],[\"JFK\",\"MUC\"],[\"SFO\",\"SJC\"],[\"LHR\",\"SFO\"]]");
        System.out.println(res);
    }
}
