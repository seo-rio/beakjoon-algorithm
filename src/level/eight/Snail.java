package level.eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @달팽이는_올라가고_싶다 https://www.acmicpc.net/problem/2869
 */
public class Snail {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine(), " ");

        int a = Integer.parseInt(stk.nextToken());
        int b = Integer.parseInt(stk.nextToken());
        int v = Integer.parseInt(stk.nextToken());

        int day = (v - b) / (a - b);

        if ((v - b) % (a - b) != 0) {
            day++;
        }

        System.out.println(day);
    }
}
