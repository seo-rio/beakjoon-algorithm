package level.three;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @A+B-4 https://www.acmicpc.net/problem/10951
 */
public class APlusBFour {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNextInt()) {
            int a = in.nextInt();
            int b = in.nextInt();
            System.out.println(a + b);
        }

        in.close();

    }
}
