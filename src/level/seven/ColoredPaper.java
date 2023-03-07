package level.seven;

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

        int[][] papers = new int[colorPaperCount][2];

        for (int i = 0; i < colorPaperCount; i++) {
            stk = new StringTokenizer(br.readLine(), " ");

            int left = Integer.parseInt(stk.nextToken());
            int bottom = Integer.parseInt(stk.nextToken());

            papers[i] = new int[]{left, bottom};

        }

        int rLeft = 0;
        int rBottom = 0;
        for (int i = 0; i < 2; i++) {
            int maxLeft = 0;
            int minLeft = 0;
            for (int j = 0; j < colorPaperCount; j++) {
                if(maxLeft < papers[j][i]) {
                    maxLeft = papers[j][i];
                }

                minLeft = minLeft == 0 ? papers[j][i] : minLeft;

                if(minLeft > papers[j][i]) {
                    minLeft = papers[j][i];
                }
            }

            if(i == 0) {
                rLeft = (maxLeft - minLeft);
            } else {
                rBottom = (maxLeft - minLeft);
            }
        }

        System.out.println((colorPaperCount - 1) * 100 + rLeft * rBottom);

    }

}
