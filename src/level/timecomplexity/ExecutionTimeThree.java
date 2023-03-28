package level.timecomplexity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @알고리즘_수업_-_알고리즘의_수행_시간_3 https://www.acmicpc.net/problem/24264
 */
public class ExecutionTimeThree {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Long n = Long.valueOf(br.readLine());

        System.out.println(n * n);
        System.out.println(2);
    }
}
