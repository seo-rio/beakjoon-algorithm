package level.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @설탕_배달 https://www.acmicpc.net/problem/2839
 */
public class SugarDelivery {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        // 5로만 배분할 수 있는 최대 개수
        int five = (int) Math.ceil((double) n / 5);
        // 3으로만 배분할 수 있는 개수
        int three = 0;
        int sum = 0;


        // 계속 루프를 돌면서 5와 3을 더해가면서 더한 값이 N값과 일치할때까지 계산
        // 최초는 5로만 더한값부터 계산
        while (true) {
            // 5 개수가 음수면 0으로 변경
            five = Math.max(five, 0);
            for (int i = 0; i < five; i++) {
                sum += 5;
            }

            for (int i = 0; i < three; i++) {
                sum += 3;
            }

            // 5랑 3이랑 더한 값이 N이랑 같으면 종료
            if(sum == n) {
                System.out.println(five + three);
                return;
            } else {
                // 5 개수는 남아있지 않은데 SUM 값이 N보다 더 크면 더이상 연산할 수 없으므로 -1 처리
                if(five == 0 && sum > n) {
                    System.out.println(-1);
                    return;
                }

                // SUM 값이 N보다 크거나 같으면 다음 연산을 진행할 수 있으므로 5값 감소 처리
                if (sum >= n) {
                    five--;
                }
                three++;
                // 다시 연산을 위해 SUM 0 으로 초기화
                sum = 0;

            }
        }

    }
}
