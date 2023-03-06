package level.six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * @킹,퀸,룩,비숍,나이트,폰 https://www.acmicpc.net/problem/3003
 */
public class Chess {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int[] chessPiece = new int[]{1,1,2,2,2,8};

        for (int i = 0; i < chessPiece.length; i++) {
            chessPiece[i] -= Integer.parseInt(st.nextToken());
        }

        Arrays.stream(chessPiece).forEach(p -> System.out.print(p + " "));


    }

}
