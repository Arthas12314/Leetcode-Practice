import java.util.HashMap;
import java.util.Map;

public class Solution447 {
    public int numberOfBoomerangs(int[][] points) {
        //优化1
        /*if(points.length<1 || points[0].length<1)   return 0;*/
        int res=0;
        //Map外置，减少new次数
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<points.length;i++){
            map.clear();
            for(int j=0;j<points.length;j++){
                if(j!=i){
                    int temp=(int)(Math.pow((points[i][0]-points[j][0]),2)+Math.pow((points[i][1]-points[j][1]),2));
                    //优化2
                    /*map.putIfAbsent(temp,0);
                    map.computeIfPresent(temp,(k,v)->v+1);*/
                    //优化实现
                    if(!map.containsKey(temp)){
                        map.put(temp, 1);
                    }else{
                        int n = map.get(temp);
                        res += 2 * n;
                        map.put(temp, 1+n);
                    }
                }
            }
            //优化2
            /*for(int key:map.keySet()){
                res+=map.get(key)*(map.get(key)-1);
            }*/
        }
        return res;
    }
    //Leetcode题解
    /**
     Project:
     Author : zhaozhen
     Date : 2019/9/15
     解题思路: 排列组合的使用
     将当前点作为第一个点，计算与非当前点的距离，保存在hashMap中，若计算距离距离在hashMap中已有值，则表明之前有相同的距离，res，因为可以换位，则乘以2，并更新到当前hash中（可以与当前距离相同
     的任意一个点交换位置）.当前点作为第一个点结束之后，清空hashMap，继续以下一个点作为第一个点。
     */
    /*public int numberOfBoomerangs(int[][] points) {
        int res = 0;
        HashMap<Double,Integer> map= new HashMap<>();
        for(int i = 0;i < points.length;i++){
            map.clear();
            for(int j = 0;j < points.length;j++){
                if(i == j){
                    continue;
                }
                double d =  Math.pow(points[i][0] - points[j][0],2) + Math.pow(points[i][1] - points[j][1],2);
                if(map.containsKey(d)){
                    res += map.get(d) * 2;
                    map.put(d, map.get(d) + 1);
                }else{
                    map.put(d,1);
                }
            }
        }
        return res;
    }*/
    public static void main(String[] args) {
        int[][] a={{0,0},{1,0},{2,0},{3,0}};
        Solution447 t=new Solution447();
        System.out.println(t.numberOfBoomerangs(a));
    }
}
