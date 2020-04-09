import java.util.Scanner;

public class main {
   
   static int modNum = 998244353;
   
   static class Polynomial {
      int t;
      int a;
      int b;
      
      public Polynomial() {}
      public Polynomial(int t, int a, int b) {
         this.t = t;
         this.a = a;
         this.b = b;
      }
   }
   
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int TC = sc.nextInt();
      int N, M;
      long x;
      long[] f;
      
      for (int t = 1; t <= TC; t++) {
         System.out.print("#" + t + " ");
         
         N = sc.nextInt();
         Polynomial[] poly = new Polynomial[N + 1];
         for (int i = 2; i <= N; i++) {
            poly[i] = new Polynomial(sc.nextInt(), sc.nextInt(), sc.nextInt());
         }
         
         M = sc.nextInt();
         for (int i = 1; i <= M; i++) {
            x = sc.nextLong();
            f = new long[N + 1];
            f[0] = 1;
            f[1] = x;
            for (int j = 2; j <= N; j++) {
               switch(poly[j].t) {
               case 1: f[j] = (f[poly[j].a] + f[poly[j].b]) % modNum; break;
               case 2: f[j] = (poly[j].a * f[poly[j].b]) % modNum; break;
               case 3: f[j] = (f[poly[j].a] * f[poly[j].b]) % modNum; break;
               }
            }
            System.out.print(f[N] + " ");
         }
         
         System.out.println();
      } // testcase 종료
      
   }
}