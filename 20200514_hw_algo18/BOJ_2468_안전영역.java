
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;
 
public class BOJ_2468_안전영역 {
    static int n = 0;
    static int[][] data;
    static int[][] check;
    static int dx[] = {-1, 1, 0, 0};
    static int dy[] = {0, 0, -1, 1};
    public static void dfs(int x,int y,int aux) {
        check[x][y] = 1;
        for(int i=0;i<4;i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx>=0 && nx<n && ny>=0 && ny<n) {
                if(check[nx][ny] == 0 && data[nx][ny]>=aux) {
                    dfs(nx, ny, aux);
                }                
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Scanner scan = new Scanner(System.in);
        int cnt = 0; 
        int max_val = 0;                                     
        n = Integer.parseInt(st.nextToken());                                
        data = new int[n][n];
        
        for(int i=0;i<n;i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<n;j++) {
                data[i][j]= Integer.parseInt(st.nextToken());
                if(max_val<data[i][j]) max_val=data[i][j]; 
            }
        }
        int max_cnt = 1;
        
        for(int k=1;k<=max_val;k++) {
            cnt=0;
            check = new int[n][n];    
            for(int i=0;i<n;i++) {
                for(int j=0;j<n;j++) {
                    if(data[i][j]>=k && check[i][j]==0) {
                        cnt++;
                        dfs(i,j,k);
                    }
                }
            }
            if(max_cnt < cnt) max_cnt=cnt;
        }
        System.out.println(max_cnt);
    }
 
}
