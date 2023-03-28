package level.inputoutput;

import java.util.Scanner;

/**
 * @사칙연산 https://www.acmicpc.net/problem/10869
 */
public class Calculation {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double a = in.nextInt();
        double b = in.nextInt();

        int plus = (int) (a + b);
        int minus = (int) (a -b);
        int mul = (int) (a * b);
        int div = (int) (a / b);
        int rem = (int) (a % b);

        System.out.println(plus);
        System.out.println(minus);
        System.out.println(mul);
        System.out.println(div);
        System.out.println(rem);

    }
}
