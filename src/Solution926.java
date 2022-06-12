public class Solution926 {
    public int minFlipsMonoIncr(String s) {
        char[] chars = s.toCharArray();
        int minFlipTimes = 0;
        int curFlipTimes = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '1') {
                curFlipTimes++;
            } else {
                minFlipTimes = Math.min(minFlipTimes +1,curFlipTimes);
            }
        }
        return minFlipTimes;
    }
}
