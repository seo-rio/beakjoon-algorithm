package level.loop;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @A+B-5 https://www.acmicpc.net/problem/10952
 */
public class APlusBFive {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<Integer> result = new ArrayList<>();

        while (true) {
            int a = in.nextInt();
            int b = in.nextInt();

            if (a == 0 && b == 0) {
                result.forEach(System.out::println);
                return;
            } else {
                result.add(a + b);
            }
        }


    }
}
