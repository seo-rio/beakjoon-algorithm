package level.eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.StringTokenizer;

/**
 * @큰_수_A+B https://www.acmicpc.net/problem/10757
 */
public class BigAPlusB {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine(), " ");

        String a = stk.nextToken();
        String b = stk.nextToken();

        BigDecimal numA = new BigDecimal(a);
        BigDecimal numB = new BigDecimal(b);

        System.out.println(numA.add(numB));

    }
}
