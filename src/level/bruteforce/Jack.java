package level.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/**
 * @블랙잭 https://www.acmicpc.net/problem/2798
 */
public class Jack {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(stk.nextToken());
        int m = Integer.parseInt(stk.nextToken());

        int[] nums = new int[n];

        stk = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(stk.nextToken());
        }

        int result = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for(int k = j + 1; k < n; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    if(m >= sum && result < sum) {
                        if(m == sum) {
                            System.out.print(sum);
                            return;
                        }
                        result = sum;
                    }
                }
            }
        }
        System.out.print(result);

    }
}
