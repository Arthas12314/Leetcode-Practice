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
        String res=LeetcodeParenthesesConvert.convert("[[0,9],[138,429],[115,359],[115,359],[-30,-102],[230,709],[-150,-686],[-135,-613],[-60,-248],[-161,-481],[207,639],[23,79],[-230,-691],[-115,-341],[92,289],[60,336],[-105,-467],[135,701],[-90,-394],[-184,-551],[150,774]]");
        System.out.println(res);
    }
}
