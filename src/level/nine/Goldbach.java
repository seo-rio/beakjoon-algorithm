package level.nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * @골드바흐의_추측 https://www.acmicpc.net/problem/9020
 */
public class Goldbach {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());

        int testCase = Integer.parseInt(stk.nextToken());

        for (int i = 0; i < testCase; i++) {
            stk = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(stk.nextToken());

            int halfNum = num / 2;

            for (int j = 1; j <= halfNum; j++) {
                int result = num - j;
                System.out.println(num + " - " + j + " = " + result);

//                System.out.println(result);

            }

            // 시간 제한 난거
            // 소수 리스트
//            ArrayList<Integer> list = new ArrayList<>();
//
//            for (int j = 2; j <= num; j++) {
//                int count = 0;
//                for (int k = 2; k <= j; k++) {
//                    if (j % k == 0) {
//                        count++;
//                    }
//                }
//                if (count == 1) {
//                    list.add(j);
//                }
//            }
//
//            int prevGap = 0;
//            int[] result = new int[2];
//
//            for (int j = 0; j < list.size(); j++) {
//                int cal = num - list.get(j);
//                if (list.contains(cal) && list.get(j) <= cal) {
//
//                    int currentGap = Math.abs(cal - list.get(j));
//                    result[0] = list.get(j);
//                    result[1] = cal;
//
//                    if (currentGap <= prevGap) {
//                        break;
//                    } else {
//                        prevGap = currentGap;
//                    }
//                }
//            }
//
//            System.out.println(result[0] + " " + result[1]);
        }
    }
}
