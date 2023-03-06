package level.six;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @바구니_순서_바꾸기 https://www.acmicpc.net/problem/10812
 */
public class BasketChange {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        int[] basket = new int[n];

        for (int i = 0; i < basket.length; i++) {
            basket[i] = i + 1;
        }

        for (int i = 0; i < m; i++) {
            int begin = in.nextInt();
            int end = in.nextInt();
            int mid = in.nextInt();

            int targetBegin = begin;

            int[] tempBasket = basket.clone();

            tempBasket[begin - 1] = basket[mid - 1];

            Arrays.stream(tempBasket).forEach(b -> System.out.print(b + " "));
            System.out.println();

            for (int j = mid; j <= end - 1; j++) {
                tempBasket[targetBegin++] = basket[j];
            }

            Arrays.stream(tempBasket).forEach(b -> System.out.print(b + " "));
            System.out.println();
            System.out.println("Begin => " + begin);
//
            int pos = (mid - begin);
            // TODO: Begin 처리
            for (int j = begin - 1; j < mid - 1; j++) {
                System.out.println("J => " + j + " 넣을곳 => " + pos);
                System.out.println("넣을값 => " + basket[j]);
                tempBasket[pos++] = basket[j]; // 3 - (4 - 1)
            }
//
            Arrays.stream(tempBasket).forEach(b -> System.out.print(b + " "));

            basket = tempBasket.clone();

        }

//        Arrays.stream(basket).forEach(b -> System.out.print(b + " "));
    }
}

// 1 2 3 4 5 6 7 8 9 10
//  -> 4 2 3 4 5 6 7 8 9 10
//  -> 4 5 6 4 5 6 7 8 9 10
//  -> 4 5 6 1 2 3 7 8 9 10
// 4 5 6 1 2 3 7 8 9 10
// 4 5(b) 8 9 6(m) 1 2 3 7 10(e)
// 4(b) 6 1(m, e) 2 3 7 10 5 8 9
// 1 4(b, m) 6 2 3 7(e) 10 5 8 9
// 1 4 6 2 3 7 10 5 8 9