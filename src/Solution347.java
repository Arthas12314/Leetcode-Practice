import java.util.*;

public class Solution347 {
    /*private class Freq implements Comparable<Freq>{
        int e,freq;

        @Override
        public int compareTo(Freq another) {
            if(this.freq>another.freq)
                return 1;
            else if(this.freq<another.freq)
                return -1;
            return 0;
        }

        public Freq(int e,int freq){
            this.e=e;
            this.freq=freq;
        }
    }*/
    private class Freq{
        int e,freq;

        public Freq(int e,int freq){
            this.e=e;
            this.freq=freq;
        }
    }

    private class FreComparator implements Comparator<Freq>{
        @Override
        public int compare(Freq o1, Freq o2) {
            return o1.freq-o2.freq;
        }
    }
    public List<Integer> topKFrequent(int[] nums,int k){
        TreeMap<Integer,Integer> map=new TreeMap<>();
        for(int num:nums){
            if(!map.containsKey(num))
                map.put(num,0);
            else
                map.put(num,map.get(num)+1);
        }
        PriorityQueue<Freq> priorityQueue=new PriorityQueue<>(new FreComparator());
        for(int key:map.keySet()){
            if(priorityQueue.size()<k)
                priorityQueue.add(new Freq(key,map.get(key)));
            else if(priorityQueue.peek().freq<map.get(key)){
                priorityQueue.remove();
                priorityQueue.add(new Freq(key,map.get(key)));
            }
        }
        LinkedList<Integer> res=new LinkedList<>();
        while(!priorityQueue.isEmpty()){
            res.add(priorityQueue.remove().e);
        }
        return res;
    }

    public static void main(String[] args) {
        Solution347 t=new Solution347();
        int[] a={1,1,1,2,2,3,3,3,4,5,6,7,8,8,8,9,9};
        System.out.println(t.topKFrequent(a,5));
    }
}
