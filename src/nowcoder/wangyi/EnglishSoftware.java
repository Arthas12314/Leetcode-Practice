package nowcoder.wangyi;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Arthas
 */
public class EnglishSoftware {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int peopleTotal = Integer.parseInt(in.nextLine());
        String[] scoresStr = in.nextLine().split(" +");
        int[] scores = new int[scoresStr.length];
        for (int i = 0; i < scoresStr.length; i++) {
            scores[i] = Integer.parseInt(scoresStr[i]);
        }
        Arrays.sort(scores);
        Map<Integer, Integer> map = new HashMap<>(scores.length);
        for (int i = 0; i < scores.length; i++) {
            map.put(scores[i], scores.length - i);
        }
        int queryTimes = Integer.parseInt(in.nextLine());
        for (int i = 0; i < queryTimes; i++) {
            int index = Integer.parseInt(in.nextLine()) - 1;
            BigDecimal divide = new BigDecimal(peopleTotal - map.get(Integer.parseInt(scoresStr[index])));
            divide = divide.multiply(BigDecimal.valueOf(100)).divide(new BigDecimal(peopleTotal), 6, RoundingMode.HALF_UP);
            System.out.println(divide);
            if (i == queryTimes - 1) {
                System.exit(0);
            }
        }
    }
}
