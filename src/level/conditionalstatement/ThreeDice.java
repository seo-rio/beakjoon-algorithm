package level.conditionalstatement;

import java.util.Scanner;

/**
 * @주사위_세개 https://www.acmicpc.net/problem/2480
 */
public class ThreeDice {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int one = in.nextInt();
        int two = in.nextInt();
        int three = in.nextInt();

        if (one == two && two == three) {
            System.out.println(10000 + one * 1000);
        } else if (one == two || two == three || one == three) {
            if (one == two) {
                System.out.println(1000 + one * 100);
            } else if (two == three) {
                System.out.println(1000 + two * 100);
            } else {
                System.out.println(1000 + three * 100);
            }
        } else {
            int bigNum = 0;
            if (one > two) {
                bigNum = Math.max(one, three);
            } else {
                bigNum = Math.max(two, three);
            }
            System.out.println(bigNum * 100);
        }

    }
}
