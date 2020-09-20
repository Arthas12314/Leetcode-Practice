public class Solution167 {
    public static void main(String[] args) {
        int[] numbers = {2, 3, 4};
        Solution167 t = new Solution167();
        numbers = t.twoSum(numbers, 6);
        for (int n : numbers) {
            System.out.println(n);
        }
    }

    public int[] twoSum(int[] numbers, int target) {
        int i = 0, j = numbers.length - 1;
        while (i < j) {
            if (numbers[i] + numbers[j] == target) {
                return new int[]{i + 1, j + 1};
            } else if (numbers[i] + numbers[j] < target) {
                i++;
            } else {
                j--;
            }
        }
        throw new IllegalArgumentException("No solution!");
    }
}
