package nowcoder.huawei;

import java.util.Scanner;

/**
 * @author Arthas
 */
public class SplitString {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String line;
        int len,temp;
        while (in.hasNextLine()) {
            line=in.nextLine().trim();
            len=0;
            while (len+8 < line.length()) {
                temp=len;
                len+=8;
                System.out.println(line.substring(temp,len));
            }
            //System.out.println(line.substring(len) + "0".repeat(Math.max(0, 8 - (line.length() - len))));
        }
    }
}
