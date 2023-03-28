package level.loop;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

/**
 * @빠른_A+B https://www.acmicpc.net/problem/15552
 */
public class QuickAPlusB {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        int testCaseCount = in.nextInt();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = 0; i < testCaseCount; i++) {
            int a = in.nextInt();
            int b = in.nextInt();

            bw.write(a + b + "\n");
        }

        bw.flush();
        bw.close();

    }
}
