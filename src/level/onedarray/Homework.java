package level.onedarray;

import java.util.Scanner;

/**
 * @과제_안_내신_분..? https://www.acmicpc.net/problem/5597
 */
public class Homework {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] studentNums = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30};

        for (int i = 0; i < 28; i++) {
            int num = in.nextInt();

            for (int j = 0; j < studentNums.length; j++) {
                if (studentNums[j] == num) {
                    studentNums[j] = 0;
                }
            }
        }

        for (int studentNum : studentNums) {
            if (studentNum != 0) {
                System.out.println(studentNum);
            }

        }

    }
}
