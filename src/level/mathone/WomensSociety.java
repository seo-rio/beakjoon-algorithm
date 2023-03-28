package level.mathone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * @부녀회장이_될테야 https://www.acmicpc.net/problem/2775
 */
public class WomensSociety {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());

        int testCase = Integer.parseInt(stk.nextToken());

        for (int o = 0; o < testCase; o++) {

            stk = new StringTokenizer(br.readLine());
            int k = Integer.parseInt(stk.nextToken());
            stk = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(stk.nextToken());

            int[] floor = new int[n];

            for (int i = 0; i < k; i++) {
                int[] temp = floor.clone();
                for (int j = 0; j < n; j++) {
                    int sum = 0;
                    for (int z = 0; z < j + 1; z++) {
                        sum += (i == 0 ? 1 : temp[z]);
                    }
                    if (j != 0) {
                        floor[j] = sum;
                    } else {
                        floor[j] = 1;
                    }
                }
            }
            System.out.println(Arrays.stream(floor).sum());
        }
    }
}
