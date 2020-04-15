package nowcoder.huawei;

import java.util.Scanner;

/**
 * @author Arthas
 */
public class CountAlphet {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        char[] strs=in.nextLine().trim().toLowerCase().toCharArray();
        char temp=in.nextLine().trim().toLowerCase().charAt(0);
        int count=0;
        for (char str : strs) {
            if (str == temp) {
                count++;
            }
        }
        System.out.println(count);
    }
}
