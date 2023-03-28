package level.factormultiple;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * @소수_찾기 https://www.acmicpc.net/problem/1978
 */
public class FindPrimeNumber {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());

        int count = Integer.parseInt(stk.nextToken());
        ArrayList<Integer> nums = new ArrayList<>(count);

        stk = new StringTokenizer(br.readLine(), " ");

        int total = 0;

        while (stk.hasMoreTokens()) {
            nums.add(Integer.valueOf(stk.nextToken()));
        }

        for (int i = 0; i < count; i++) {
            int n = 0;
            if (nums.get(i) != 1) {
                for (int j = 2; j <= nums.get(i); j++) {
                    if (n > 1) {
                        break;
                    }
                    if (nums.get(i) % j == 0) {
                        n++;
                    }
                }

                if(n == 1) {
                    total++;
                }

            }

        }

        System.out.println(total);
    }
}
