package level.five;

import java.util.Scanner;

/**
 * @문자열_반복 https://www.acmicpc.net/problem/2675
 */
public class StringLoop {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int count = in.nextInt();

        for (int i = 0; i < count; i++) {
            int loopCount = in.nextInt();
            String word = in.next();

            StringBuilder loopResult = new StringBuilder();
            for (int j = 0; j < word.length(); j++) {
                loopResult.append(String.valueOf(word.charAt(j)).repeat(Math.max(0, loopCount)));
            }

            System.out.println(loopResult);

        }
    }
}
