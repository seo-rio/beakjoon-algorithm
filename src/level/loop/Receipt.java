package level.loop;

import java.util.Scanner;

/**
 * @영수증 https://www.acmicpc.net/problem/25304
 */
public class Receipt {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int totalPrice = in.nextInt();
        int totalCount = in.nextInt();

        int result = 0;
        for (int i = 0; i < totalCount; i++) {
            int price = in.nextInt();
            int count = in.nextInt();

            result += price * count;

            if(i == totalCount - 1) {
                if(result == totalPrice) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }

            }

        }
    }
}
