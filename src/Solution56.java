import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Solution56 {
    public int[][] merge(int[][] intervals) {
        if(intervals.length<1 || intervals[0].length<1)
            return intervals;
        ArrayList<int[]> res=new ArrayList<>();
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return Integer.compare(o1[0],o2[0]);
            }
        });
        res.add(intervals[0]);
        for(int i=1;i<intervals.length;i++){
            if(res.get(res.size()-1)[1]<intervals[i][0]){
               res.add(intervals[i]);
            }
            else if(res.get(res.size()-1)[1]>=intervals[i][0]){
                int[] temp=res.remove(res.size()-1);
                if(temp[1]<intervals[i][1])
                    res.add(new int[]{temp[0], intervals[i][1]});
                else
                    res.add(new int[]{temp[0],temp[1]});
            }
        }
        int[][] result=new int[res.size()][2];
        for(int i=0;i<res.size();i++){
            result[i][0]=res.get(i)[0];
            result[i][1]=res.get(i)[1];
        }
        return result;
    }

    public static void main(String[] args) {
        Solution56 t=new Solution56();
        int[][] a={{1,4},{2,3}};//{{1,3},{2,6},{8,10},{15,18}};
        int[][] res= t.merge(a);
        for(int[] i:res){
            System.out.println("["+i[0]+","+i[1]+"]");
        }
    }
}
