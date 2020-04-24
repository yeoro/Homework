import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BOJ16234_인구이동 {

   private static int[] dx = {-1, 0, 1, 0};
   private static int[] dy = {0, 1, 0, -1};

   private static int N, L, R, ans;
   private static int[][] area;
   private static boolean[][] visited;

   public static class Position{
      int x;
      int y;

      Position(int x, int y) { this.x = x; this.y = y; }
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);   
      N = sc.nextInt();
      L = sc.nextInt();
      R = sc.nextInt();

      area = new int[N][N];
      for (int i = 0; i < N; i++) {
         for (int j = 0; j < N; j++) {
            area[i][j] = sc.nextInt();
         }
      }


      Queue<Position> que = new LinkedList<>();
      boolean isMove = true;
      
      while(isMove) {
         visited = new boolean[N][N];
         isMove = false;
         for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
               if (visited[i][j] || getMovePosition(new Position(i, j)).isEmpty()) continue;
               if(!isMove) ans++;
               
               ArrayList<Position> posList = new ArrayList<>();
               posList.add(new Position(i, j));
               que.offer(new Position(i, j));
               visited[i][j] = isMove = true;               
               
               while(!que.isEmpty()) {
                  ArrayList<Position> tempList = getMovePosition(que.poll());
                  if (tempList.isEmpty()) continue;
                  for (Position p : tempList) {
                     que.offer(p);
                     posList.add(p);
                     visited[p.x][p.y] = true;
                  }
               }
               setPopul(posList);   
            }
         }
      }
      
      System.out.println(ans);
   }

   
   public static void setPopul(ArrayList<Position> pos) {
      int sum = 0;
      for (Position p : pos) sum += area[p.x][p.y];
      int avg = sum / pos.size();
      for (Position p : pos) area[p.x][p.y] = avg;
   }

   public static ArrayList<Position> getMovePosition(Position pos) {
      ArrayList<Position> res = new ArrayList<>();
      for (int k = 0; k < 4; k++) {
         int nx = pos.x + dx[k];
         int ny = pos.y + dy[k];
         if (nx < 0 || nx >= N || ny < 0 || ny >= N || visited[nx][ny]) continue;
         int dif = Math.abs(area[pos.x][pos.y] - area[nx][ny]);
         if (dif < L || dif > R) continue; 
         res.add(new Position(nx, ny));
      }
      
      return res;
   }

}