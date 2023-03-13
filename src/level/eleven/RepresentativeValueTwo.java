package level.eleven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @대표값2 https://www.acmicpc.net/problem/2587
 */
public class RepresentativeValueTwo {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] nums = new int[5];

        for (int i = 0; i < 5; i++) {
            nums[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 1; i < nums.length; i++) {
            int key = nums[i];

            int index = i - 1;

            while (index >= 0 && key < nums[index]) {
                nums[index + 1] = nums[index];
                index--;
            }
            nums[index + 1] = key;
        }

        double average = Arrays.stream(nums).average().orElse(0);
        System.out.println((int) average);
        System.out.println(nums[2]);
    }

}
