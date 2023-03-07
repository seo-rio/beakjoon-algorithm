package level.seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * @행렬_덧셈 https://www.acmicpc.net/problem/2738
 */
public class ProcessionSum {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(stk.nextToken());
        int m = Integer.parseInt(stk.nextToken());

        int[][] a = new int[n][m];
        int[][] b = new int[n][m];


        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < n; j++) {
                stk = new StringTokenizer(br.readLine(), " ");
                for (int k = 0; k < m; k++) {
                    if(i == 0) {
                        a[j][k] = Integer.parseInt(stk.nextToken());
                    } else {
                        b[j][k] = Integer.parseInt(stk.nextToken());
                    }
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sb.append(a[i][j] + b[i][j]).append(j == m - 1 ? "\n" : " ");
            }
        }

        System.out.println(sb);
    }
}
