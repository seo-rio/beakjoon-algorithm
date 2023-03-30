package level.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @영화감독_숌 https://www.acmicpc.net/problem/1436
 */
public class MovieDirector {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int num = 666;
        int index = 1;

        while (index < n) {
            num++;
            if(String.valueOf(num).contains("666")) {
                index++;
            }
        }

        System.out.println(num);


    }
}
