package level.five;

import java.util.Scanner;

/**
 * @다이얼 https://www.acmicpc.net/problem/5622
 */
public class Dial {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        char[][] dial = new char[][]{{'A', 'B', 'C'}, {'D', 'E', 'F'}, {'G', 'H', 'I'}, {'J', 'K', 'L'}, {'M', 'N', 'O'}, {'P', 'Q', 'R', 'S'},
            {'T', 'U', 'V'}, {'W', 'X', 'Y', 'Z'}};
        String word = in.nextLine();

        int result = 0;
        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j < dial.length; j++) {
                for (int k = 0; k < dial[j].length; k++) {
                    if (dial[j][k] == word.charAt(i)) {
                        result += (j + 2 + 1);
                    }
                }
            }
        }
        System.out.println(result);
    }
}
