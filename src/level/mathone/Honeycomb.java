package level.mathone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @벌집 https://www.acmicpc.net/problem/2292
 */
public class Honeycomb {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(stk.nextToken());
        int last = 1;
        int prevMax = last;
        int i = 1;

        if(n == 1) {
            System.out.println(i);
            return;
        }

        while (n > last) {
            last = 6 * i + prevMax;
            prevMax = last;
            i++;
        }

        System.out.println(i);
    }

}
