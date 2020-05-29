import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class SWEA_1953_탈주범검거 {
   static int ans;
   static int N, M, R, C, L;
   static int[][] map;
   static int[] dx = {-1, 0, 1, 0};
   static int[] dy = {0, 1, 0, -1};
   static boolean[][] v;
   static int[] curPipe = new int[4];
   static int[] nextPipe = new int[4];
   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
      StringTokenizer st = null;
      int T = Integer.parseInt(br.readLine().trim());
      for (int t = 1; t <= T; t++) {
         st = new StringTokenizer(br.readLine().trim());
         N = Integer.parseInt(st.nextToken());
         M = Integer.parseInt(st.nextToken());
         R = Integer.parseInt(st.nextToken());
         C = Integer.parseInt(st.nextToken());
         L = Integer.parseInt(st.nextToken());
         map = new int[N][M];
         v = new boolean[N][M];
         for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine().trim());
            for(int j=0; j<M; j++) {
               map[i][j] = Integer.parseInt(st.nextToken());
            }
         }
         ans = 1;
         bfs();
         bw.write("#" + t + " " + ans + "\n");
      }
      bw.flush();
      bw.close();
      br.close();
   }
   static void bfs() {
      Queue<Data> q = new LinkedList<>();
      q.offer(new Data(R, C, 1));
      v[R][C] = true;
      while(!q.isEmpty()) {
         Data d = q.poll();
         if(d.cnt == L) break;
         getPipe(map[d.x][d.y], curPipe);
         for(int i=0; i<4; i++) {
            if(curPipe[i] == 0) continue;
            int nx = d.x + dx[i];
            int ny = d.y + dy[i];
            if(nx<0 || nx>=N || ny<0 || ny>=M) continue;
            if(v[nx][ny]) continue;
            if(map[nx][ny] == 0) continue;
            getPipe(map[nx][ny], nextPipe);
            if(!isConnect(i)) continue;
            q.offer(new Data(nx, ny, d.cnt+1));
            v[nx][ny] = true;
            ans++;
         }
      }
   }
   static boolean isConnect(int dir) {
      if(nextPipe[(dir+2)%4] == 1) return true;
      return false;
   }
   static void getPipe(int type, int[] p) {
      Arrays.fill(p, 0);
      switch (type) {
      case 1:
         Arrays.fill(p, 1);
         break;
      case 2:
         p[0] = 1;
         p[2] = 1;
         break;
      case 3:
         p[1] = 1;
         p[3] = 1;
         break;
      case 4:
         p[0] = 1;
         p[1] = 1;
         break;
      case 5:
         p[1] = 1;
         p[2] = 1;
         break;
      case 6:
         p[2] = 1;
         p[3] = 1;
         break;
      case 7:
         p[0] = 1;
         p[3] = 1;
         break;
      }
   }
   static class Data {
      int x;
      int y;
      int cnt;
      public Data(int x, int y, int cnt) {
         this.x = x;
         this.y = y;
         this.cnt = cnt;
      }
   }
}