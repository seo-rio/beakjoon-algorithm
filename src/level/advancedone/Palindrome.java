package level.advancedone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @팰린드롬인지_확인하기 https://www.acmicpc.net/problem/10988
 */
public class Palindrome {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String word = br.readLine();

        int half = word.length() / 2;

        for (int i = 0; i < half; i++) {
            if (word.charAt(i) != word.charAt(word.length() - (i + 1))) {
                System.out.println("0");
                return;
            }
        }

        System.out.println("1");


    }
}
