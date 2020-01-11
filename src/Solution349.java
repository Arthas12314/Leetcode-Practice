import java.util.ArrayList;
import java.util.TreeSet;

public class Solution349 {
    public int[] intersection(int[] nums1,int[] nums2){
        TreeSet<Integer> set=new TreeSet<>();
        ArrayList<Integer> list=new ArrayList<>();
        for(int num:nums1){
            set.add(num);
        }
        for(int num:nums2){
            if(set.contains(num)){
                list.add(num);
                set.remove(num);
            }
        }
        int[] res=new int[list.size()];
        for(int i=0;i<list.size();i++){
            res[i]=list.get(i);
        }
        return res;
    }
}
