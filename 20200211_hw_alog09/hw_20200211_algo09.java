import java.util.Scanner;
 
public class hw_20200211_algo09 {
 
    static int parent[];
 
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
         
        int TC = sc.nextInt(); // 테스트 케이스 개수
         
        for(int tc = 1; tc <= TC; tc++) {
             
            int n = sc.nextInt(); // 집합 개수
            int m = sc.nextInt(); // 연산 개수
             
            parent = new int[n + 1];
             
            make();
             
            System.out.print(String.format("#%d ", tc));
             
            for(int i = 0; i < m; i++) {
                 
                int a = sc.nextInt();
                 
                if(a == 0) {
                    union(sc.nextInt(), sc.nextInt());
                }
                if(a == 1) {
                    int x = findSet(sc.nextInt());
                    int y = findSet(sc.nextInt());
                     
                    if(x == y) {
                        System.out.print(1);
                         
                    }else {
                        System.out.print(0);
                    }
                }
            }
            System.out.println();
        }
    }
     
    static void make() {
        for(int i = 1; i < parent.length; i++) {
            parent[i] = i;
        }
    }
     
    static void union(int x, int y) {
        x = findSet(x);
        y = findSet(y);
         
        if(x == y) {
            return;
        }
         
        if(x > y) {
            parent[x] = y;
        }else {
            parent[y] = x;
        }
    }
     
    static int findSet(int x) {
        if(x == parent[x]) {
            return x;
        }
        return parent[x] = findSet(parent[x]);
    }
}
