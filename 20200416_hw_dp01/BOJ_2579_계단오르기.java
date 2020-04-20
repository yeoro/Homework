import java.util.Scanner;

public class BOJ_2579_계단오르기 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] point = new int[n + 1];
      for (int i = 1; i <= n; i++) point[i] = sc.nextInt();
      
      int[][] dp = new int[2][n + 1];
      dp[0][1] = dp[1][1] = point[1];
      
      for (int i = 2; i <= n; i++) {
         dp[0][i] = point[i] + dp[1][i - 1];
         dp[1][i] = point[i] + Math.max(dp[0][i - 2],dp[1][i - 2]);
      }
      
      System.out.println(Math.max(dp[0][n], dp[1][n]));
   }
}