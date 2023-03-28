package level.loop;

import java.util.Scanner;

/**
 * @별_찍기-1 https://www.acmicpc.net/problem/2438
 */
public class StarOne {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int count = in.nextInt();

        for (int i = 0; i < count; i++) {
            System.out.println("*".repeat(i + 1));
        }
    }
}
