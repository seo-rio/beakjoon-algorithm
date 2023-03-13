package level.nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @골드바흐의_추측 https://www.acmicpc.net/problem/9020
 */
public class Goldbach {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer stk = new StringTokenizer(br.readLine());

        int testCase = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < testCase; i++) {
//            stk = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(br.readLine());

            int halfNum = num / 2;

            int num1 = 0;
            int num2 = 0;

            for (int j = 2; j <= halfNum; j++) {
                int result = num - j;

                int jCount = 0;
                int rCount = 0;

                System.out.println("j => " + j);
                System.out.println("(int) Math.sqrt(j) => " + (int) Math.sqrt(j));
                for (int k = 2; k <= (int) Math.sqrt(j); k++) {
                    if (j % k == 0) {
                        jCount++;
                        break;
                    }
                }

                for (int k = 2; k <= (int) Math.sqrt(result); k++) {
                    if (result % k == 0) {
                        rCount++;
                        break;
                    }
                }

                if (jCount == 0 && rCount == 0) {
                    num1 = j;
                    num2 = result;
                }

            }

            sb.append(num1).append(" ").append(num2).append("\n");
        }

        System.out.println(sb);
    }
}
