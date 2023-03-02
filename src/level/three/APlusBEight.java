package level.three;

import java.util.Scanner;

/**
 * @A+B-8 https://www.acmicpc.net/problem/11022
 */
public class APlusBEight {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int testCaseCount = in.nextInt();

        int[] aArr = new int[testCaseCount];
        int[] bArr = new int[testCaseCount];
        int[] result = new int[testCaseCount];

        for (int i = 0; i < testCaseCount; i++) {
            int a = in.nextInt();
            int b = in.nextInt();

            aArr[i] = a;
            bArr[i] = b;

            result[i] = a + b;
        }

        for (int i = 0; i < result.length; i++) {
            System.out.println("Case #" + (i + 1) + ": " + aArr[i] + " + " + bArr[i] + " = " + result[i]);
        }


    }
}
