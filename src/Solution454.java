import java.util.HashMap;
import java.util.Map;

public class Solution454 {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<A.length;i++){
            for(int j=0;j<B.length;j++){
                map.putIfAbsent(A[i]+B[j],0);
                map.computeIfPresent(A[i]+B[j],(k,v)->v+1);
            }
        }
        int res=0;
        for(int i=0;i<C.length;i++){
            for(int j=0;j<D.length;j++){
                if(map.get(-C[i]-D[j])!=null)
                    res+=map.get(-C[i]-D[j]);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Solution454 t=new Solution454();
        int[] a={1,2},b={-2,-1},c={-1,2},d={0,2};
        System.out.println(t.fourSumCount(a,b,c,d));
    }
}
