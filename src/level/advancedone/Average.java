package level.advancedone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * @평균은_넘겠지 https://www.acmicpc.net/problem/4344
 */
public class Average {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());

        int testCaseCount = Integer.parseInt(stk.nextToken());

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < testCaseCount; i++) {
            stk = new StringTokenizer(br.readLine(), " ");
            int studentCount = Integer.parseInt(stk.nextToken());

            int sum = 0;
            int[] points = new int[studentCount];

            for (int j = 0; j < studentCount; j++) {
                int point = Integer.parseInt(stk.nextToken());
                points[j] = point;
                sum += point;
            }

            double average = (double) sum / studentCount;

            int overStudentCount = (int) Arrays.stream(points).filter(p -> p > average).count();

            double rate = (((double) overStudentCount / studentCount) * 100);

            sb.append(String.format("%.3f", rate)).append("%\n");
        }

        System.out.println(sb);
    }

}
