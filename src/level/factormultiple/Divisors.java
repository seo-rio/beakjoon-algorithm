package level.factormultiple;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

/**
 * @약수_구하기 https://www.acmicpc.net/problem/2501
 */
public class Divisors {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine(), " ");

        int num = Integer.parseInt(stk.nextToken());
        int rank = Integer.parseInt(stk.nextToken());

        HashSet<Integer> set = new HashSet<>();
        for (int i = 1; i <= num; i++) {
            if(num % i == 0) {
                if(set.size() == rank - 1) {
                    System.out.println(i);
                    return;
                } else {
                    set.add(i);
                }
            }
        }

        if(set.size() < rank) {
            System.out.println(0);
        }
    }
}
