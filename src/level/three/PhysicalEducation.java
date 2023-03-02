package level.three;

import java.util.Scanner;

/**
 * @코딩은_체육과목_입니다 https://www.acmicpc.net/problem/25314
 */
public class PhysicalEducation {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int byteNum = in.nextInt();

        int longCount = byteNum / 4;

        System.out.println("long ".repeat(Math.max(0, longCount)) + "int");
    }
}
