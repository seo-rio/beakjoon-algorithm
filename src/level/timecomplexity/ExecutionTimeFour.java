package level.timecomplexity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @알고리즘_수업_-_알고리즘의_수행_시간_4 https://www.acmicpc.net/problem/24265
 */
public class ExecutionTimeFour {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long n = Long.parseLong(br.readLine());

        System.out.println(n * (n - 1) / 2);
        System.out.println(2);
    }
}
