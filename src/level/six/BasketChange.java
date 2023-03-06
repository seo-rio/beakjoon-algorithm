package level.six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * @바구니_순서_바꾸기 https://www.acmicpc.net/problem/10812
 */
public class BasketChange {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(stk.nextToken());
        int m = Integer.parseInt(stk.nextToken());

        int[] basket = new int[n];

        for (int i = 0; i < basket.length; i++) {
            basket[i] = i + 1;
        }

        for (int i = 0; i < m; i++) {
            stk = new StringTokenizer(bf.readLine());
            int begin = Integer.parseInt(stk.nextToken());
            int end = Integer.parseInt(stk.nextToken());
            int mid = Integer.parseInt(stk.nextToken());

            int targetBegin = begin;

            int[] tempBasket = basket.clone();

            tempBasket[begin - 1] = basket[mid - 1];

            for (int j = mid; j <= end - 1; j++) {
                tempBasket[targetBegin++] = basket[j];
            }

            for (int j = begin - 1; j < mid - 1; j++) {
                tempBasket[(end - mid + 1) + j] = basket[j];
            }

            basket = tempBasket.clone();

        }

        Arrays.stream(basket).forEach(b -> System.out.print(b + " "));
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