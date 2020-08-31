import java.util.ArrayList;
import java.util.List;

/**
 * @author Arthas
 */
public class Solution841 {
    private List<Integer> res = new ArrayList<>();

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int totalRooms = rooms.size();
        boolean[] visited = new boolean[totalRooms];
        res.add(0);
        visited[0] = true;
        dfs(rooms, rooms.get(0), visited);
        return res.size() == totalRooms;
    }

    private void dfs(List<List<Integer>> rooms, List<Integer> tmp, boolean[] visited) {
        for (int i = 0; i < tmp.size(); i++) {
            int room = tmp.get(i);
            if (visited[room]) {
                continue;
            }
            res.add(room);
            visited[room] = true;
            dfs(rooms, rooms.get(room), visited);
        }
    }
}
