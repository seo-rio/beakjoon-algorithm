package level.advancedone;

import java.util.Scanner;

/**
 * @별찍기-7 https://www.acmicpc.net/problem/2444
 */
public class StartSeven {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();

        StringBuilder star = new StringBuilder();

        for (int i = 0; i < num - 1; i++) {
            for (int j = 0; j < num + i; j++) {
                if ((num - i - 2) >= j) {
                    star.append(" ");
                } else {
                    star.append("*");
                }
            }
            star.append("\n");
        }

        for (int i = num - 1; i >= 0; i--) {
            for (int j = 0; j < num + i; j++) {
                if ((num - i - 2) >= j) {
                    star.append(" ");
                } else {
                    star.append("*");
                }
            }
            star.append("\n");
        }

        System.out.println(star);
    }
}
