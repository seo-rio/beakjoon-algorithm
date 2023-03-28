package level.twodarray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @색종이 https://www.acmicpc.net/problem/2563
 */
public class ColoredPaper {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());

        int colorPaperCount = Integer.parseInt(stk.nextToken());

        int[][] area = new int[100][100];

        int count = 0;

        for (int i = 0; i < colorPaperCount; i++) {
            stk = new StringTokenizer(br.readLine(), " ");
            int left = Integer.parseInt(stk.nextToken());
            int bottom = Integer.parseInt(stk.nextToken());

            for (int j = left; j < left + 10; j++) {
                for (int k = bottom; k < bottom + 10; k++) {
                    area[j][k] = 1;
                }
            }
        }

        for (int[] row : area) {
            for (int value : row) {
                if (value == 1) {
                    count++;
                }
            }
        }

        System.out.println(count);

    }

}
