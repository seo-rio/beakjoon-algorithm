package level.mathone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @분수_찾기 https://www.acmicpc.net/problem/1193
 */
public class FindFraction {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());

        int index = 1;
        int count = 1;

        while (index < x) {
            count++;
            index += count;
        }

        if (count % 2 == 0) {
            System.out.println((count - (index - x)) + "/" + (index - x + 1));
        } else {
            System.out.println((index - x + 1) + "/" + (count - (index - x)));

        }


    }
}
