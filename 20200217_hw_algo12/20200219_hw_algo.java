import java.io.*;
import java.util.*;
class Main {
    static int[] arr;
    static int cnt, ans, dig;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int TC = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        for (int test_case = 1; test_case <= TC; test_case++) {
            sb.append("#" + test_case + " ");
            st = new StringTokenizer(br.readLine());
            int info = Integer.parseInt(st.nextToken());
            cnt = Integer.parseInt(st.nextToken());
            ans = 0;
            int tmp = info;
            dig = 1;
            while (true) {
                if (tmp / 10 > 0) {
                    dig++;
                    tmp /= 10;
                } else {
                    break;
                }
            }
            arr = new int[dig];
            for (int i = dig - 1; i >= 0; i--) {
                arr[i] = info % 10;
                info /= 10;
            }
            go(0, 0);
            sb.append(ans + "\n");
        }
        System.out.println(sb);
    }
    static void go(int idx, int shf) {
        if (shf == cnt) {
            int tmp = 0;
            for (int i = 0; i < dig; i++) {
                tmp += arr[i];
                tmp *= 10;
            }
            tmp /= 10;
            if (tmp > ans)
                ans = tmp;
            return;
        }
        for (int i = idx; i < dig; i++) {
            for (int j = i + 1; j < dig; j++) {
                if (arr[i] <= arr[j]) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                    go(i, shf + 1);
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
    }
}