package level.twodarray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @세로_읽기 https://www.acmicpc.net/problem/10798
 */
public class VerticalReading {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk;
        StringBuilder sb = new StringBuilder();


        char[][] sentenceArr = new char[5][15];
        for (int i = 0; i < sentenceArr.length; i++) {
            stk = new StringTokenizer(br.readLine());
            String sentence = stk.nextToken();
            sentenceArr[i] = sentence.toCharArray();
        }

        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                sb.append(sentenceArr[j].length <= i ? "" : sentenceArr[j][i]);
            }
        }

        System.out.println(sb);
    }
}
