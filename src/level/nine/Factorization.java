package level.nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @소인수_분해 https://www.acmicpc.net/problem/11653
 */
public class Factorization {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());

        int num = Integer.parseInt(stk.nextToken());

        if(num == 1) {
            return;
        }

        StringBuilder sb = new StringBuilder();
        while (num > 1) {
            for (int i = 2; i <= num; i++) {

                if (num % i == 0) {
                    sb.append(i).append("\n");
                    num = num / i;
                    break;
                }

            }
        }

        System.out.println(sb);
    }

}
