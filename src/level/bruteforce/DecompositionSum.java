package level.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @분해합 https://www.acmicpc.net/problem/2231
 */
public class DecompositionSum {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int result = 0;

        for (int i = 0; i < N; i++) {
            System.out.println("I => " + i);
            int number = i;
            int sum = 0;    // 각 자릿수 합 변수

            while (number != 0) {
                System.out.println("Number1 => " + number);
                sum += number % 10;    // 각 자릿수 더하기
                number /= 10;
                System.out.println("Number2 => " + number);
                System.out.println("Sum => " + sum);
            }

            System.out.println("===== CUT =====");

            // i 값과 각 자릿수 누적합이 같을 경우 (생성자를 찾았을 경우)
            if (sum + i == N) {
                result = i;
                break;
            }

        }

        System.out.println(result);
    }
}
