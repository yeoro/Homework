import java.util.Arrays;
import java.util.Scanner;
 
public class BOJ_1062_가르침 {
 
    public static void main(String[] args) throws Exception {
        // TODO Auto-generated method stub
 
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
 
        int[] A = new int[n];
        int[] B = new int[n];
 
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            B[i] = sc.nextInt();
 
        }
        Arrays.sort(A);
        Arrays.sort(B);
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += A[i] * B[n - 1 - i];
        }
        System.out.println(sum);
 
    }
}