package level.twodarray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @최댓값 https://www.acmicpc.net/problem/2566
 */
public class Max {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk;

        int maxValue = 0;
        int maxPosX = 0;
        int maxPosY = 0;
        for (int i = 0; i < 9; i++) {
            stk = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < 9; j++) {
                int num = Integer.parseInt(stk.nextToken());
                if(maxValue < num) {
                    maxValue = num;
                    maxPosX = i;
                    maxPosY = j;
                }

            }
        }
        System.out.println(maxValue);
        System.out.println(++maxPosX + " " + ++maxPosY);
    }
}
