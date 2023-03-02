package level.one;

import java.util.Scanner;

/**
 * @나머지 https://www.acmicpc.net/problem/10430
 */
public class Remain {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();

        System.out.println((num1 + num2) % num3);
        System.out.println(((num1 % num3) + (num2 % num3)) % num3);
        System.out.println((num1 * num2) % num3);
        System.out.println(((num1 % num3) * (num2 % num3)) % num3);

    }
}
