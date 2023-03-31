package level.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * @칸토어_집합 https://www.acmicpc.net/problem/4779
 */
public class CantorianSet {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int lineNum = Integer.parseInt(br.readLine());

        StringBuilder line = new StringBuilder();

        int lineCount = 1;

        for (int i = 1; i <= lineNum; i++) {
            lineCount *= 3;
        }

        line.append("-".repeat(Math.max(0, lineCount)));


        System.out.println(lineCount);
        System.out.println(line);


        cantorian(line.toString().toCharArray());


    }

    static int count = 0;

    static char[] cantorian(char[] line) {
        System.out.println("IN");
        count++;

        int l = line.length / 3;

        for (int i = 0; i < line.length; i++) {
            if(line[i] == ' ') {
                System.out.println("FIND => " +(i / 3));
                l = (i / 3);
                break;
            }
        }


        System.out.println(line);
        // 1 => 9, 10, 11, 12, 13, 14, 15, 16, 17 (1)(9)
        // 2 => 3,4,5 | 21,22,23 (2)(3)
        // 3 => 1 | 7 | 19 | 25 (4)(1)
        for (int i = 0; i < line.length; i++) {
            if(i >= l && i < l + l) {
                line[i] = ' ';
            }
        }

        System.out.println(line);

        char[] arr1 = new char[l];
        char[] arr2 = new char[l];
        for (int i = 0; i < l; i++) {
            arr1[i] = line[i];
        }

        System.out.println();

        for(int i = l + l; i < line.length; i++) {
            arr2[i] = line[i];
        }

        if (count != 3) {
            cantorian(line);
        }


        return line;
    }
}
