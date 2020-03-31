package codinginterviews;

public class Solution13 {
    public int movingCount(int m, int n, int k) {
        boolean[][] visit=new boolean[m][n];
        return dfs(visit,0,0,k);
    }

    private int dfs(boolean[][] visit,int i,int j,int k){
        if(i<0 || j<0 || i==visit.length || j==visit[0].length || (i/10+i%10+j/10+j%10)>k || visit[i][j]){
            return 0;
        }
        visit[i][j]=true;
        return dfs(visit,i+1,j,k)+
        dfs(visit,i-1,j,k)+
        dfs(visit,i,j+1,k)+
        dfs(visit,i,j-1,k)+1;
    }

    public static void main(String[] args) {
        Solution13 t=new Solution13();
        System.out.println(t.movingCount(16,8,4));
    }
}
