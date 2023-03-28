package level.conditionalstatement;

import java.util.Scanner;

/**
 * @알람_시계 https://www.acmicpc.net/problem/2884
 */
public class Alarm {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int h = in.nextInt();
        int m = in.nextInt();

        int calH = m - 45 < 0 ? h - 1 < 0 ? 23 : h - 1 : h;
        int calM = m - 45 < 0 ? m - 45 + 60 : m - 45;

        System.out.println(calH + " " + calM);

    }
}
