package codinginterviews;

import java.util.Arrays;

/**
 * @author Arthas
 */
public class Solution40 {
    public int[] getLeastNumbers(int[] arr, int k) {
        int len=arr.length;
        if (len < 1) {
            return new int[]{};
        }
        int[] res=new int[k];
        for (int i = (len - 1) / 2; i >= 0; i--) {
            siftDown(arr,len,i);
        }
        for (int i = len - 1, j = 0; j < k; i--, j++) {
            res[j]=arr[0];
            swap(arr,i,0);
            siftDown(arr,i,0);
        }
        return res;
    }

    private void siftDown(int[] arr,int len,int index) {
        while (index * 2 + 1 < len) {
            int k = index * 2 + 1;
            if (k + 1 < len && arr[k + 1] < arr[k]) {
                k++;
            }
            if (arr[index] <= arr[k]) {
                break;
            }
            swap(arr,index,k);
            index=k;
        }
    }

    private void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static void main(String[] args) {
        int[] arr={3,2,1};
        Solution40 t=new Solution40();
        int[] res=t.getLeastNumbers(arr,2);
        System.out.println(Arrays.toString(res));
    }
}
