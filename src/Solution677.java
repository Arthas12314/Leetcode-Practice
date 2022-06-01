import java.util.HashMap;
import java.util.Map;

public class Solution677 {
    private Map<String,Integer> map;
    public Solution677() {
        map = new HashMap<>();
    }

    public void insert(String key, int val) {
        map.put(key,val);
    }

    public int sum(String prefix) {
        int sum = 0;
        for (String key : map.keySet()) {
            if (key.startsWith(prefix)) {
                sum+=map.get(key);
            }
        }
        return sum;
    }
}
