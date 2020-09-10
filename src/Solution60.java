import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: Kevin Arthas
 * @date: 2020/9/10
 * @time: 16:51
 */
public class Solution60 {
    private List<String> result;
    private int permutationOrder;

    public static void main(String[] args) {
        Solution60 t = new Solution60();
        String res = t.getPermutation(4, 9);
        System.out.println(res);
    }

    public String getPermutation(int n, int k) {
        result = new ArrayList<>();
        StringBuilder temp = new StringBuilder();
        permutationOrder = k;

        boolean[] visited = new boolean[n];
        nextPermutation(visited, n, temp);
        return result.get(k - 1);
    }

    private void nextPermutation(boolean[] visited, int total, StringBuilder temp) {
        if (temp.length() == total) {
            result.add(new String(temp));
            return;
        }
        for (int i = 1; i <= total && permutationOrder >= 0; i++) {
            if (!visited[i - 1]) {
                visited[i - 1] = true;
                temp.append(i);
                nextPermutation(visited, total, temp);
                temp.deleteCharAt(temp.length() - 1);
                visited[i - 1] = false;
            }
            if (result.size() == permutationOrder) {
                break;
            }
        }
    }
}
