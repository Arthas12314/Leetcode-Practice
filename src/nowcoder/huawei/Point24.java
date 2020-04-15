package nowcoder.huawei;

import java.util.Scanner;

/**
 * @author Arthas
 */
public class Point24 {
    String res;
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String[] strs=in.nextLine().trim().split(" +");
        for (String s : strs) {
            if ("JOKER".equals(s) || "joker".equals(s)) {
                System.out.println("ERROR");
                System.exit(0);
            }
        }
        if (getresult(strs, 1, strs[0].charAt(0) - 'A' + 1)) {
            System.out.println();
        }
    }

    private static boolean getresult(String[] strs,int index,int result){
        if(index==4){
            return result == 24;
        }
        boolean mark= getresult(strs,index+1,result*(strs[index].charAt(0)-'A'+1))
                || getresult(strs,index+1,result+(strs[index].charAt(0)-'A'+1))
                || getresult(strs,index+1,result-(strs[index].charAt(0)-'A'+1))
                || getresult(strs,index+1,result/(strs[index].charAt(0)-'A'+1));
        return mark;
    }
}
