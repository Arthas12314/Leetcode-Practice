import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Solution350 {
    public int[] intersect(int[] nums1,int[] nums2){
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        ArrayList<Integer> list=new ArrayList<>();
        for(int num:nums1){
            if(!hashMap.containsKey(num))
                hashMap.put(num,1);
            else
                hashMap.put(num,hashMap.get(num)+1);
        }
        for(int num:nums2){
            if(hashMap.containsKey(num)){
                list.add(num);
                hashMap.put(num,hashMap.get(num)-1);
                if(hashMap.get(num)==0)
                    hashMap.remove(num);
            }
        }
        int[] res=new int[list.size()];
        for(int i=0;i<list.size();i++){
            res[i]=list.get(i);
        }
        return res;
    }
}
