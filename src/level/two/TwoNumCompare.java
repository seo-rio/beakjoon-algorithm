package level.two;

import java.util.Scanner;

/**
 * @두_수_비교하기 https://www.acmicpc.net/problem/1330
 */
public class TwoNumCompare {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num1 = in.nextInt();
        int num2 = in.nextInt();

        if(num1 > num2) {
            System.out.println(">");
        } else if(num1 < num2) {
            System.out.println("<");
        } else {
            System.out.println("==");
        }
    }
}
