package level.onedarray;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @나머지 https://www.acmicpc.net/problem/3052
 */
public class Remain {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] remain = new int[10];

        for (int i = 0; i < remain.length; i++) {
            int num = in.nextInt();
            remain[i] = num % 42;
        }

        int[] distinct = Arrays.stream(remain).distinct().toArray();

        System.out.println(distinct.length);
    }
}
