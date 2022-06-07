public class Solution1037 {
    public boolean isBoomerang(int[][] points) {
        int x12 = points[1][0] - points[0][0];
        int y12 = points[1][1] - points[0][1];
        int x23 = points[2][0] - points[1][0];
        int y23 = points[2][1] - points[1][1];
        
        return x23 * y12 - x12 * y23 != 0;
    }
}
