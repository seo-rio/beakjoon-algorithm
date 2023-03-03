package level.five;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * @단어_공부 https://www.acmicpc.net/problem/1157
 */
public class WordStudy {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String word = in.next();

        word = word.toUpperCase();

        System.out.println(word);

        char[] alphabet = word.toCharArray();

        Character[] charArrBoxed = new String(alphabet).chars()
                .mapToObj(c -> (char) c)
                .toArray(Character[]::new);

        List<Character> distList = Arrays.stream(charArrBoxed).distinct().collect(Collectors.toList());

        StringBuilder resultWord = new StringBuilder();

        int topCount = 0;
        for (Character character : distList) {
            int count = 0;
            String currentWord = "";
            for (char c : alphabet) {
                if (character == c) {
                    count++;
                    currentWord = String.valueOf(c);
                }
            }

            if(topCount < count) {
                topCount = count;
                resultWord = new StringBuilder(currentWord);
            } else if(topCount == count) {
                resultWord.append(currentWord);
            }

        }

        System.out.println(resultWord.length() > 1 ? "?" : resultWord);
    }
}
