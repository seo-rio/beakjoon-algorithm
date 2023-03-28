package level.mathone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @ACM_호텔 https://www.acmicpc.net/problem/10250
 */
public class AcmHotel {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());

        int caseCount = Integer.parseInt(stk.nextToken());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < caseCount; i++) {
            stk = new StringTokenizer(br.readLine(), " ");
            int h = Integer.parseInt(stk.nextToken());
            int w = Integer.parseInt(stk.nextToken());
            int n = Integer.parseInt(stk.nextToken());

            int x = (int) Math.ceil((double) n / h);
            int y = n - ((x - 1) * h);

            String xFormat = String.format("%02d", x);

            sb.append(y).append(xFormat).append("\n");
        }

        System.out.println(sb);
    }
}
