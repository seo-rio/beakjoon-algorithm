package level.string;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * @알파벳_찾기 https://www.acmicpc.net/problem/10809
 */
public class FindAlphabet {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String word = in.next();
        int[] asciiAlphabet = IntStream.rangeClosed(97, 122).toArray();
        int[] validate = new int[asciiAlphabet.length];
        Arrays.fill(validate, -1);

        for (int i = 0; i < asciiAlphabet.length; i++) {
            for (int j = 0; j < word.length(); j++) {
                int ascii = word.charAt(j);
                if (asciiAlphabet[i] == ascii) {
                    if (validate[i] == -1) {
                        validate[i] = j;
                    }
                }
            }
        }

        Arrays.stream(validate).forEach(v -> System.out.print(v + " "));

    }
}
