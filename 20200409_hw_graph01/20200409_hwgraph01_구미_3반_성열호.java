import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main{
   static int V, E;
   static Data[] data;
   static int[] parents;
   static int ans;
   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
      StringTokenizer st = new StringTokenizer(br.readLine().trim());
      V = Integer.parseInt(st.nextToken());
      E = Integer.parseInt(st.nextToken());
      parents = new int[V];
      data = new Data[E];
      ans = 0;
      for (int i = 0; i < E; i++) {
         st = new StringTokenizer(br.readLine().trim());
         int a = Integer.parseInt(st.nextToken()) - 1;
         int b = Integer.parseInt(st.nextToken()) - 1;
         int c = Integer.parseInt(st.nextToken());
         data[i] = new Data(a, b, c);
      }
      Arrays.sort(data, new Comparator<Data>() {

         @Override
         public int compare(Data o1, Data o2) {
            return o1.c - o2.c;
         }
      });
      makeSet();
      int cnt = 0;
      for(int i=0; i<E; i++) {
         if(findSet(data[i].a) == findSet(data[i].b)) continue;
         union(data[i].a, data[i].b);
         ans += data[i].c;
         cnt++;
         if(cnt == V - 1) break;
      }
      bw.write(ans + "");
      bw.flush();
      bw.close();
      br.close();
      
   }
   static void makeSet() {
      for(int i=0; i<V; i++) {
         parents[i] = i;
      }
   }
   static int findSet(int x) {
      if(parents[x] == x) return x;
      return parents[x] = findSet(parents[x]);
   }
   static void union(int x, int y) {
	      x = findSet(x);
	      y = findSet(y);
	      if(x == y) return;
	      parents[y] = x;
	   }
   static class Data{
      int a;
      int b;
      int c;
      public Data(int a, int b, int c) {
         super();
         this.a = a;
         this.b = b;
         this.c = c;
      }
      @Override
      public String toString() {
         return "Data [a=" + a + ", b=" + b + ", c=" + c + "]";
      }
   }
}