import java.util.*;

public class Solution149 {
    public int maxPoints(int[][] points) {
        if(points.length<3) return points.length;
        int res=1;
        for(int i=0;i<points.length;i++){
            int same=1;
            for(int j=i+1;j<points.length;j++){
                int count=0;
                if(points[i][0]==points[j][0]&&points[i][1]==points[j][1])
                    same++;
                else{
                    count++;
                    long xDiff = (points[i][0] - points[j][0]);//Δx1
                    long yDiff = (points[i][1] - points[j][1]);//Δy1

                    for (int k = j + 1; k < points.length; k ++)//Δy1/Δx1=Δy2/Δx2 => Δx1*Δy2=Δy1*Δx2，计算和直线ji在一条直线上的点
                        if (xDiff * (points[i][1] - points[k][1]) == yDiff * (points[i][0] - points[k][0]))
                            count++;
                }
                res=Math.max(res,same+count);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] a={{1,1},{1,1},{1,1}};//{{0,9},{138,429},{115,359},{115,359},{-30,-102},{230,709},{-150,-686},{-135,-613},{-60,-248},{-161,-481},{207,639},{23,79},{-230,-691},{-115,-341},{92,289},{60,336},{-105,-467},{135,701},{-90,-394},{-184,-551},{150,774}};
        Solution149 t=new Solution149();
        System.out.println(t.maxPoints(a));
    }
}
