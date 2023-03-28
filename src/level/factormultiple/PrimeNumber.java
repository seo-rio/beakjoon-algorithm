package level.factormultiple;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @소수 https://www.acmicpc.net/problem/2581
 */
public class PrimeNumber {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk;

        stk = new StringTokenizer(br.readLine());
        int num1 = Integer.parseInt(stk.nextToken());

        stk = new StringTokenizer(br.readLine());
        int num2 = Integer.parseInt(stk.nextToken());

        int min = 0;
        int sum = 0;

        StringBuilder sb = new StringBuilder();
        for (int i = num1; i <= num2; i++) {
            int n = 0;
            for (int j = 2; j <= i; j++) {
                if (n > 1) {
                    break;
                }
                if (i % j == 0) {
                    n++;
                }
            }
            if (n == 1) {
                if(min == 0) {
                    min = i;
                }
                sum += i;

                System.out.println(i);
            }
        }

        if(sum == 0) {
            sb.append(-1);
        } else {
            sb.append(sum).append("\n");
            sb.append(min);

        }

        System.out.println("===");
        System.out.println(sb);
    }

}
