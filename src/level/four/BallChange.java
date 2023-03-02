package level.four;

import java.util.Scanner;

/**
 * @공_바꾸기 https://www.acmicpc.net/problem/10813
 */
public class BallChange {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int basketCount = in.nextInt();
        int changeCount = in.nextInt();

        int[] basket = new int[basketCount];

        for (int i = 0; i < basket.length; i++) {
            basket[i] = i + 1;
        }

        for (int i = 0; i < changeCount; i++) {
            int start = in.nextInt();
            int end = in.nextInt();

            int temp = basket[start - 1];
            basket[start - 1] = basket[end - 1];
            basket[end - 1] = temp;
        }

        for (int i : basket) {
            System.out.print(i + " ");
        }
    }
}
