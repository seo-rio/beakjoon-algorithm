package level.thirteen;

import java.util.Scanner;

/**
 * @블랙잭 https://www.acmicpc.net/problem/2798
 */
public class Jack {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int M = in.nextInt();

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println("N => " + N);
        System.out.println("M => " + M);



    }
}
