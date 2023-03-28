package level.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @수학은_비대면강의입니다 https://www.acmicpc.net/problem/19532
 */
public class OnlineClass {

    /*
     * 1(2) + 3(-1) = -1
     * 4(2) + 1(-1) = 7
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine(), " ");

        int a = Integer.parseInt(stk.nextToken());
        int b = Integer.parseInt(stk.nextToken());
        int c = Integer.parseInt(stk.nextToken());
        int d = Integer.parseInt(stk.nextToken());
        int e = Integer.parseInt(stk.nextToken());
        int f = Integer.parseInt(stk.nextToken());

        for (int i = -999; i <= 999; i++) {
            for (int j = -999; j <= 999; j++) {
                if((a * i) + (b * j) == c && (d * i) + (e * j) == f) {
                    System.out.print(i + " " + j);
                }
            }
        }
    }
}
