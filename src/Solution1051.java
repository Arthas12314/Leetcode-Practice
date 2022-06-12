import java.util.Arrays;

public class Solution1051 {
    private int diffNum = 0;
    
    public int heightChecker(int[] heights) {
        int[] sortedArrays = Arrays.copyOf(heights, heights.length);
        Arrays.sort(sortedArrays);
        int diffNum = 0;
        for (int i = 0; i < heights.length; i++) {
            if (sortedArrays[i] != heights[i]) {
                diffNum++;
            }
        }
        return diffNum;
    }

    public int rightHeightChecker(int[] heights) {
        // 计数
        int[] termFreq = new int[101];
        for(int height: heights){
            termFreq[height]++;
        }
        // 转前缀和
        for(int i = 1; i <= 100; i++){
            termFreq[i] += termFreq[i - 1];    // 某个高度前面有多少个数，即这个高度排序后该在的位置
        }
        int count = 0;
        for(int i = 0; i < heights.length; i++){
            if(!(termFreq[heights[i] - 1] <= i && i < termFreq[heights[i]])){
                // 当前高度并不在它该在的位置上
                count++;
            }
        }
        return count;
    }
    
    private void swap(int[] heights, int origin, int aim) {
        diffNum++;
        int temp = heights[origin];
        heights[origin] = heights[aim];
        heights[aim] = temp;
    }
    
    public static void main(String[] args) {
        Solution1051 solution1051 = new Solution1051();
        System.out.println(solution1051.heightChecker(new int[] {1,2,3,4}));
    }
}
