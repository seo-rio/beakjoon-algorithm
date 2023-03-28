package level.string;

import java.util.Scanner;

/**
 * @아스키_코드 https://www.acmicpc.net/problem/11654
 */
public class AsciiCode {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String word = in.next();
        int asciiCode = word.charAt(0);
        System.out.println(asciiCode);
    }
}
