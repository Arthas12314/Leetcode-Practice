public class Solution134 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int maxGasCostDiffIndex = 0;
        int maxGasAccum = 0;
        int sum = 0;
        for (int i = 0; i < gas.length; i++) {
            maxGasAccum += gas[i] - cost[i];
            sum += gas[i] - cost[i];
            if (maxGasAccum < 0) {
                maxGasAccum = 0;
                maxGasCostDiffIndex = i + 1;
            }
        }
        if (maxGasCostDiffIndex == gas.length || sum < 0) {
            return -1;
        }
        return maxGasCostDiffIndex;
    }

    public static void main(String[] args) {
        Solution134 solution134 = new Solution134();
        int[] gas = new int[]{1, 2, 3, 4, 5};
        int[] cost = new int[]{3, 4, 5, 1, 2};
        int res = solution134.canCompleteCircuit(gas, cost);
        System.out.println(res);
    }
}
