package level.onedarray;

import java.util.Scanner;

/**
 * @최댓값 https://www.acmicpc.net/problem/2562
 */
public class Max {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int max = 0;
        int index = 0;

        for (int i = 0; i < 9; i++) {
            int num = in.nextInt();
            if(max < num) {
                max = num;
                index = i + 1;
            }
        }

        System.out.println(max);
        System.out.println(index);

    }
}
