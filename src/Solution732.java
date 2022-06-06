import java.util.TreeMap;

public class Solution732 {
    // K记录每个时刻的日程时间点，V记录对应的日程数量
    private TreeMap<Integer, Integer> map;
    
    public Solution732() {
        // TreeMap排序后开始执行日程
        map = new TreeMap<>();
    }
    
    public int book(int start, int end) {
        // 日程开始则并行的会议室数量+1
        map.put(start, map.getOrDefault(start, 0) + 1);
        // 日程结束则并行的会议室数量-1
        map.put(end, map.getOrDefault(end, 0) - 1);
        int count = 0;
        int max = 0;
        // 遍历全部时间节点统计并行会议室预定情况
        for (int curBookNum : map.values()) {
            // 统计每个开始&结束节点的并行会议室数
            count += curBookNum;
            // 取最大的并行数
            max = Math.max(max, count);
        }
        return max;
    }
}
