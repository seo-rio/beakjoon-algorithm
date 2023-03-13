package level.eleven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * @수_정렬하기 https://www.acmicpc.net/problem/2750
 */
public class NumberSort {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());

        int[] nums = new int[count];

        for (int i = 0; i < count; i++) {
            nums[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 1; i < nums.length; i++) {

            int key = nums[i];

            int index = i - 1;

            while (true) {
                if(index == -1) {
                    break;
                }
                if(nums[index] > key) {
                    nums[index + 1] = nums[index];
                    nums[index] = key;
                } else {
                    break;
                }
                index--;
            }

        }
        Arrays.stream(nums).forEach(System.out::println);
    }
}
