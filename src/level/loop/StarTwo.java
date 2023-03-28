package level.loop;

import java.util.Scanner;

/**
 * @별_찍기-2 https://www.acmicpc.net/problem/2439
 */
public class StarTwo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int count = in.nextInt();

        for (int i = 0; i < count; i++) {
            StringBuilder star = new StringBuilder();
            for (int j = 0; j < count; j++) {
                if((count -1) - i > j) {
                    star.append(" ");
                } else {
                    star.append("*");
                }
            }

            System.out.println(star);
        }
    }
}
