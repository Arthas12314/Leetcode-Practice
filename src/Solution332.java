import java.util.*;

/**
 * @author Arthas
 */
public class Solution332 {
    Map<String, PriorityQueue<String>> map = new HashMap<>();
    List<String> itinerary = new LinkedList<>();

    public List<String> findItinerary(List<List<String>> tickets) {
        for (List<String> ticket : tickets) {
            String src = ticket.get(0), dst = ticket.get(1);
            if (!map.containsKey(src)) {
                map.put(src, new PriorityQueue<>());
            }
            map.get(src).offer(dst);
        }
        dfs("JFK");
        Collections.reverse(itinerary);
        return itinerary;
    }

    public void dfs(String curr) {
        while (map.containsKey(curr) && !map.get(curr).isEmpty()) {
            String tmp = map.get(curr).poll();
            dfs(tmp);
        }
        itinerary.add(curr);
    }

    public static void main(String[] args) {
        Solution332 t = new Solution332();
        List<List<String>> tickets = new ArrayList<>();
        String[][] matrix = {{"MUC", "LHR"}, {"JFK", "MUC"}, {"SFO", "SJC"}, {"LHR", "SFO"}};
        for (int i = 0; i < matrix.length; i++) {
            List<String> temp = new ArrayList<>();
            for (int j = 0; j < matrix[i].length; j++) {
                temp.add(matrix[i][j]);
            }
            tickets.add(new ArrayList<>(temp));
        }
        System.out.println(t.findItinerary(tickets));
    }
}
