public class Solution2038 {
    public boolean winnerOfGame(String colors) {
        int diff = 0;
        char[] arr = colors.toCharArray();
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i - 1] == 'A' && arr[i - 1] == arr[i] && arr[i - 1] == arr[i + 1]) {
                diff++;
            }
            if (arr[i - 1] == 'B' && arr[i - 1] == arr[i] && arr[i - 1] == arr[i + 1]) {
                diff--;
            }
        }
        return diff > 0;
    }

    public static void main(String[] args) {
        Solution2038 solution2038 = new Solution2038();
        System.out.println(solution2038.winnerOfGame("AAABABB"));
    }
}
