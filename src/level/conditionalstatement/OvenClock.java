package level.conditionalstatement;

import java.util.Scanner;

/**
 * @오븐_시계 https://www.acmicpc.net/problem/2525
 */
public class OvenClock {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int h = in.nextInt();
        int m = in.nextInt();

        int time = in.nextInt();

        int calM = 0;
        int calH = h;
        if(m + time >= 60) {
            int addH = (m + time) / 60;
            calH = calH + addH >= 24 ? calH + addH - 24 : calH + addH;
            calM = (m + time) - (addH * 60);
        } else {
            calM = m + time;
        }

        System.out.println(calH + " " + calM);



    }
}
