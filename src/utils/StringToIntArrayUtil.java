package utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringToIntArrayUtil {
    public static List<List<Integer>> convert(String inputStr) {
        String[] strs = inputStr.split("\n");
        List<List<Integer>> matrix = new ArrayList<>();
        for (String str : strs) {
            List<Integer> list = Arrays.stream(str.substring(1, str.length() - 1).trim().split(","))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
            matrix.add(list);
        }
        return matrix;
    }
    
    public static int[] collection2Array(List<Integer> list) {
        int[] nums = new int[list.size()];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = list.get(i);
        }
        return nums;
    }
}
