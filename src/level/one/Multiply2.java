package level.one;

import java.util.Scanner;

/**
 * @곱셈 https://www.acmicpc.net/problem/2588
 */
public class Multiply2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String a = in.next();
        String b = in.next();

        for (int i = b.length(); i > 0; i--) {
            System.out.println(Integer.parseInt(a) * Integer.parseInt(String.valueOf(b.charAt(i - 1))));
        }

        System.out.println(Integer.parseInt(a) * Integer.parseInt(b));

    }
}
