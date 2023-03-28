package level.string;

import java.util.Scanner;

/**
 * @단어의_개수 https://www.acmicpc.net/problem/1152
 */
public class WordCount {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String sentence = in.nextLine();

        String[] words = sentence.split("\\s");

        int count = 0;
        for (String word : words) {
            if(!word.isEmpty()) {
                count++;
            }
        }

        System.out.println(count);

    }
}
