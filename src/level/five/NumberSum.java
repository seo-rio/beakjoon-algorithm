package level.five;

import java.util.Scanner;

/**
 * @숫자의_합 https://www.acmicpc.net/problem/11720
 */
public class NumberSum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int numberCount = in.nextInt();
        String number = in.next();

        int result = 0;
        for (int i = 0; i < numberCount; i++) {
            result += Character.getNumericValue(number.charAt(i));
        }
        System.out.println(result);

    }
}
