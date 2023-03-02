package level.one;

import java.util.Scanner;

/**
 * @A/B https://www.acmicpc.net/problem/1008
 */
public class Divide {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double a = in.nextInt();
        double b = in.nextInt();

        double result = a / b;
        System.out.println(result);
    }
}
