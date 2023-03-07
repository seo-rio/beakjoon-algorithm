package level.six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * @너의_평점은 https://www.acmicpc.net/problem/25206
 */
public class YourGrade {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String, Double> table = new HashMap<>();
        table.put("A+", 4.5);
        table.put("A0", 4.0);
        table.put("B+", 3.5);
        table.put("B0", 3.0);
        table.put("C+", 2.5);
        table.put("C0", 2.0);
        table.put("D+", 1.5);
        table.put("D0", 1.0);
        table.put("F", 0.0);

        double subjectSum = 0.0;
        double pointSum = 0.0;

        for (int i = 0; i < 20; i++) {
            StringTokenizer stk = new StringTokenizer(br.readLine(), " ");

            stk.nextToken();
            double point = Double.parseDouble(stk.nextToken());
            String grade = stk.nextToken();

            if (grade.equals("P")) {
                continue;
            }

            pointSum += point;
            subjectSum += (point * table.get(grade));
        }

        System.out.printf("%.6f%n", (subjectSum / pointSum));
    }
}
