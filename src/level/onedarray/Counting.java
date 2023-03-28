package level.onedarray;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @개수_세기 https://www.acmicpc.net/problem/10807
 */
public class Counting {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int count = in.nextInt();

        int[] arr = new int[count];

        for (int i = 0; i < count; i++) {
            arr[i] = in.nextInt();
        }

        int target = in.nextInt();

        System.out.println(Arrays.stream(arr).filter(n -> n == target).count());

    }

}
