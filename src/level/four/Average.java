package level.four;

import java.util.Arrays;
import java.util.Scanner;

public class Average {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int subjectCount = in.nextInt();

        int[] subjectPoints = new int[subjectCount];

        for (int i = 0; i < subjectCount; i++) {
            subjectPoints[i] = in.nextInt();
        }

        int maxPoint = Arrays.stream(subjectPoints).max().orElse(0);
        double totalNewPoint = 0;

        for (int subjectPoint : subjectPoints) {
            double newPoint = ((double) subjectPoint / maxPoint) * 100;
            totalNewPoint += newPoint;

        }

        System.out.println(totalNewPoint/subjectCount);

    }
}
