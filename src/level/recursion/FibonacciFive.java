package level.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @피보나치_수_5 https://www.acmicpc.net/problem/10870
 */
public class FibonacciFive {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        System.out.println(fibonacci(num));
    }

    // 10 + 45 -> 9 + 25 -> 8 + 13 -> 7 + 6 -> 6 + 2 -> 5 + 0 -> 4 + (-1) -> 3 + (-1) -> 2 + (-1) -> 1 + 0
    // 55      -> 34     -> 21     -> 13    -> 8     -> 5     -> 3        -> 2        -> 1        -> 1
    static int fibonacci(int num) {
        if(num <= 1) {
            return num;
        } else {
            int value1 = fibonacci(num - 2);
            int value2 = fibonacci(num - 1);

            System.out.println("num => " + num + " value1 = " + value1 + " Value2 => " + value2);

            return value1 + value2;
        }
    }
}
