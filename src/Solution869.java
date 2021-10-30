import java.util.*;

class Solution869 {
    private static final Map<Integer,Set<String>> standardCountMap= new HashMap<>();
    static {
        for (int i = 1; i < 1000000000; i *= 2) {
            String temp = i+ "";
            char[] tmpArr = temp.toCharArray();
            Arrays.sort(tmpArr);
            String sortNumStr = String.valueOf(tmpArr);
            Set<String> curSet = standardCountMap.getOrDefault(temp.length(), new HashSet<>());
            curSet.add(sortNumStr);
            standardCountMap.put(temp.length(),curSet);
        }
    }

    public boolean reorderedPowerOf2(int n) {
        String num = String.valueOf(n);
        char[] tmpArr = num.toCharArray();
        Arrays.sort(tmpArr);
        String sortNumStr = String.valueOf(tmpArr);
        return standardCountMap.get(sortNumStr.length()).contains(sortNumStr);
    }
}
