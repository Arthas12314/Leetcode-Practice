package CodingInterviews;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution29 {
    public int[] spiralOrder(int[][] matrix) {
        if (matrix.length < 1 || matrix[0].length < 1) {
            return new int[]{};
        }
        int up=0,down=matrix.length,left=0,right=matrix[0].length;
        int i=0,j=0,sum=down*right,count=0;
        int[] res=new int[sum];
        while(count<sum){
            while (j<right){
                res[count++]=matrix[i][j++];
            }
            j--;i++;
            if (++up >= down) {
                break;
            }
            while (i<down){
                res[count++]=matrix[i++][j];
            }
            i--;j--;
            if (--right <= left) {
                break;
            }
            while (j>=left){
                res[count++]=matrix[i][j--];
            }
            j++;i--;
            if (--down <= up) {
                break;
            }
            while (i>=up){
                res[count++]=matrix[i--][j];
            }
            i++;j++;
            if (++left >= right) {
                break;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Solution29 t=new Solution29();
        int[][] matrix={{}};//{{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        System.out.println(Arrays.toString(t.spiralOrder(matrix)));
    }
}
