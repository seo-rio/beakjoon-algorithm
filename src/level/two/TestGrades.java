package level.two;

import java.util.Scanner;

/**
 * @시험_성적 https://www.acmicpc.net/problem/9498
 */
public class TestGrades {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int point = in.nextInt();

        if(point >= 90 && point <= 100) {
            System.out.println("A");
        } else if(point >= 80 && point <= 89) {
            System.out.println("B");
        } else if(point >= 70 && point <= 79) {
            System.out.println("C");
        } else if(point >= 60 && point <= 69) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}
