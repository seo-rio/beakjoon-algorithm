package level.four;

import java.util.Scanner;

/**
 * @공넣기 https://www.acmicpc.net/problem/10810
 */
public class BallIn {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int basketCount = in.nextInt();
        int ballCount = in.nextInt();

        int[] basket = new int[basketCount];

        for (int i = 0; i < ballCount; i++) {

            int start = in.nextInt();
            int end = in.nextInt();
            int ballNum = in.nextInt();

            for (int j = start - 1; j < end; j++) {
                basket[j] = ballNum;
            }
        }

        for (int i : basket) {
            System.out.print(i + " ");
        }

    }
}
