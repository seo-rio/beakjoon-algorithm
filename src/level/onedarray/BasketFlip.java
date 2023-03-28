package level.onedarray;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * @바구니_뒤집기 https://www.acmicpc.net/problem/10811
 */
public class BasketFlip {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int basketCount = in.nextInt();
        int flipCount = in.nextInt();

        int[] baskets = IntStream.rangeClosed(1, basketCount).toArray();

        for (int i = 0; i < flipCount; i++) {
            int start = in.nextInt();
            int end = in.nextInt();

            int gap = end - start;
            for (int j = start; j < end; j++) {
                if (gap > 0) {
                    int temp = baskets[j - 1];
                    baskets[j - 1] = baskets[(j - 1) + gap];
                    baskets[(j - 1) + gap] = temp;
                    gap -= 2;
                }
            }


            Arrays.stream(baskets).forEach(b -> System.out.print(b + " "));
        }
    }
}
// 1 2 3 4 5 6 7 8 9 10
// 1 6 3 4 5 2 7 8 9 10
// 1 6 5 4 3 2 7 8 9 10

// 1 2 3 4 5
// 2 1 3 4 5
// 2 1 4 3 5
// 3 1 4 2 5
// 3 4 1 2 5
// 3 4 1 2 5