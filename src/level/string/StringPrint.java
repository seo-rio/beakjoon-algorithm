package level.string;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @문자열 https://www.acmicpc.net/problem/9086
 */
public class StringPrint {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int count = in.nextInt();
        String[] words = new String[count];

        for (int i = 0; i < count; i++) {
            String word = in.next();
            words[i] = word.charAt(0) + "" + word.charAt(word.length() - 1);
        }

        Arrays.stream(words).forEach(System.out::println);


    }
}
