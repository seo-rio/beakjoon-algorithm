package level.loop;

import java.util.Scanner;

/**
 * @A+B-7 https://www.acmicpc.net/problem/11021
 */
public class APlusBSeven {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int testCaseCount = in.nextInt();

        int[] result = new int[testCaseCount];

        for (int i = 0; i < testCaseCount; i++) {
            int a = in.nextInt();
            int b = in.nextInt();

            result[i] = a + b;
        }

        for (int i = 0; i < result.length; i++) {
            System.out.println("Case #" + (i + 1) + ": " + result[i]);
        }


    }
}
