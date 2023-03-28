package level.onedarray;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @X보다_작은_수 https://www.acmicpc.net/problem/10871
 */
public class LessNumber {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int count = in.nextInt();
        int num = in.nextInt();

        int[] nums = new int[count];

        System.out.println(count);
        System.out.println(num);

        for (int i = 0; i < count; i++) {
            nums[i] = in.nextInt();
        }

        Arrays.stream(nums).filter(n -> n < num).forEach(System.out::println);



    }


}
