package nowcoder.huawei;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 * @author Arthas
 */
public class SortScores {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        List<String> list=new ArrayList<>();
        int num=Integer.parseInt(in.nextLine());
        int mark=Integer.parseInt(in.nextLine());
        for(int i=0;i<num;i++){
            list.add(in.nextLine());
        }
        list.sort(new Comparator<>(){

            @Override
            public int compare(String o1, String o2) {
                String[] str1=o1.split(" +");
                String[] str2=o2.split(" +");
                return mark==0?
                        Integer.compare(Integer.parseInt(str2[1]),Integer.parseInt(str1[1]))
                        :Integer.compare(Integer.parseInt(str1[1]),Integer.parseInt(str2[1]));
            }
        });
        for (String s : list) {
            System.out.println(s);
        }
    }
}
