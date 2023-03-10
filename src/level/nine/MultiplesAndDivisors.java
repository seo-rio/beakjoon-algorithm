package level.nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @배수와_약수 https://www.acmicpc.net/problem/5086
 */
public class MultiplesAndDivisors {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk;
        int num1;
        int num2;

        while (true) {
            stk = new StringTokenizer(br.readLine(), " ");
            num1 = Integer.parseInt(stk.nextToken());
            num2 = Integer.parseInt(stk.nextToken());

            if (num1 == 0 && num2 == 0) {
                break;
            }
            if (num2 % num1 == 0) {
                System.out.println("factor");
            } else if (num1 % num2 == 0) {
                System.out.println("multiple");
            } else {
                System.out.println("neither");
            }

        }
    }
}
