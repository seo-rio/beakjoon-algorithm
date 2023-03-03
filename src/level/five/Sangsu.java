package level.five;

import java.util.Scanner;

/**
 * @상수 https://www.acmicpc.net/problem/2908
 */
public class Sangsu {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] numbers = in.nextLine().split("\\s");

        String num1 = String.valueOf(numbers[0].charAt(2)) + String.valueOf(numbers[0].charAt(1)) + String.valueOf(numbers[0].charAt(0));;
        String num2 = String.valueOf(numbers[1].charAt(2)) + String.valueOf(numbers[1].charAt(1)) + String.valueOf(numbers[1].charAt(0));;


        if(Integer.parseInt(num1) > Integer.parseInt(num2)) {
            System.out.println(num1);
        } else {
            System.out.println(num2);
        }
    }
}
