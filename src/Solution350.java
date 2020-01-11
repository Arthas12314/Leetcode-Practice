import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Solution350 {
    public int[] intersect(int[] nums1,int[] nums2){
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        ArrayList<Integer> list=new ArrayList<>();
        for(int e:nums1){
            if(!hashMap.containsKey(e))
                hashMap.put(e,1);
            else
                hashMap.put(e,hashMap.get(e)+1);
        }
        for(int e:nums2){
            if(hashMap.containsKey(e)){
                hashMap.put(e,hashMap.get(e)-1);
                list.add(e);
                if(hashMap.get(e)==0)
                    hashMap.remove(e);
            }
        }
        int[] res=new int[list.size()];
        for(int i=0;i<list.size();i++){
            res[i]=list.get(i);
        }
        return res;
    }
}
