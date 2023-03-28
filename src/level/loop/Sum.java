package level.loop;

import java.util.Scanner;

/**
 * @합 https://www.acmicpc.net/problem/8393
 */
public class Sum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();

        int result = 0;
        for (int i = 1; i <= num; i++) {
            result += i;
        }

        System.out.println(result);
    }
}
