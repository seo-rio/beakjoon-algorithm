package level.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @하노이_탑_이동_순서 https://www.acmicpc.net/problem/11729
 */
public class HanoiTower {

    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        sb.append((int) (Math.pow(2, n) - 1)).append('\n');

        hanoi(n, 1, 2, 3);

        System.out.println(sb);
    }

    public static void hanoi(int N, int start, int mid, int to) {
        // 이동할 원반의 수가 1개라면?
        if (N == 1) {
            sb.append(start).append(" ").append(to).append("\n");
            return;
        }

        // A -> C로 옮긴다고 가정할 떄,
        // STEP 1 : N-1개를 A에서 B로 이동 (= start 지점의 N-1개의 원판을 mid 지점으로 옮긴다.)
        hanoi(N - 1, start, to, mid);

        // STEP 2 : 1개를 A에서 C로 이동 (= start 지점의 N번째 원판을 to지점으로 옮긴다.)
        sb.append(start).append(" ").append(to).append("\n");

        // STEP 3 : N-1개를 B에서 C로 이동 (= mid 지점의 N-1개의 원판을 to 지점으로 옮긴다.)
        hanoi(N - 1, mid, start, to);

    }
}


/*

    1
    2         1
    3         2         1
    4         3         2
    ㅡ ㅡ ㅡ   ㅡ ㅡ ㅡ  ㅡ ㅡ ㅡ

    2
    3         2
    4  1      3     1    2  1
    ㅡ ㅡ ㅡ   ㅡ ㅡ ㅡ   ㅡ ㅡ ㅡ


    3
    4  1  2   3  2  1      1  2
    ㅡ ㅡ ㅡ   ㅡ ㅡ ㅡ   ㅡ ㅡ ㅡ

    3     1      1            1
    4     2   3  2            2
    ㅡ ㅡ ㅡ   ㅡ ㅡ ㅡ   ㅡ ㅡ ㅡ

          1      1
    4  3  2      2  3
    ㅡ ㅡ ㅡ   ㅡ ㅡ ㅡ

    1
    4  3  2   1  2  3
    ㅡ ㅡ ㅡ   ㅡ ㅡ ㅡ

    1  2            2
    4  3      1     3
    ㅡ ㅡ ㅡ   ㅡ ㅡ ㅡ

       1            1
       2            2
    4  3            3
    ㅡ ㅡ ㅡ   ㅡ ㅡ ㅡ

       1
       2
       3  4
    ㅡ ㅡ ㅡ   연속되는 수가 있다면 거기먼저 아니면 오른쪽으로

       2  1
       3  4
    ㅡ ㅡ ㅡ

          1
    2  3  4
    ㅡ ㅡ ㅡ

    1
    2  3  4
    ㅡ ㅡ ㅡ

    1     3
    2     4
    ㅡ ㅡ ㅡ

          3
    2  1  4
    ㅡ ㅡ ㅡ

          2
          3
       1  4
    ㅡ ㅡ ㅡ

          1
          2
          3
          4
    ㅡ ㅡ ㅡ

 */