package level.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @칸토어_집합 https://www.acmicpc.net/problem/4779
 */
public class CantorianSet {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String lineNum = "";

        while((lineNum = br.readLine()) != null){
            StringBuilder sb = new StringBuilder();

            int lineCount = 1;

            for (int i = 1; i <= Integer.parseInt(lineNum); i++) {
                lineCount *= 3;
            }

            sb.append("-".repeat(Math.max(0, lineCount)));
            char[] line = sb.toString().toCharArray();

            cantorian(line, line.length, 0);

        }




    }

    static void cantorian(char[] line, int l, int n) {

        l = l == 0 ? 1 : l / 3;
        n = n == 0 ? 1 : n * 2;

        int step = 0;
        for (int i = 0; i < line.length; i++) {
            if (line[i] != ' ') {
                ++step;
                if (step > l && step <= l + l) {
                    line[i] = ' ';
                }
            } else {
                step = 0;
            }
        }

        if (l == 1) {
            System.out.println(line);
            return;
        }

        cantorian(line, l, n);
    }
}
