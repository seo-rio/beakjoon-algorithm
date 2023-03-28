package level.factormultiple;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * @약수들의_합 https://www.acmicpc.net/problem/9506
 */
public class DivisorsSum {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {

            StringTokenizer stk = new StringTokenizer(br.readLine());

            int num = Integer.parseInt(stk.nextToken());

            if (num == -1) {
                return;
            }

            int sum = 0;
            ArrayList<Integer> divisors = new ArrayList<>();

            for (int i = 1; i < num; i++) {
                if (num % i == 0) {
                    divisors.add(i);
                    sum += i;
                }
            }

            StringBuilder sb = new StringBuilder();

            if (sum == num) {
                sb.append(num).append(" = ");
                for (int i = 0; i < divisors.size(); i++) {
                    sb.append(divisors.get(i)).append(i == divisors.size() - 1 ? "" : " + ");
                }
            } else {
                sb.append(num).append(" is NOT perfect.");
            }

            System.out.println(sb);
        }

    }

}
