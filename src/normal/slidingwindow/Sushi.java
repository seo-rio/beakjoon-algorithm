package normal.slidingwindow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Sushi {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(stk.nextToken());
        int d = Integer.parseInt(stk.nextToken());
        int k = Integer.parseInt(stk.nextToken());
        int c = Integer.parseInt(stk.nextToken());

        int[] plate = new int[n + (k - 1)];

        for (int i = 0; i < n; i++) {
            stk = new StringTokenizer(br.readLine());
            plate[i] = Integer.parseInt(stk.nextToken());
        }

        for (int i = 0; i < k - 1; i++) {
            plate[i + n] = plate[i];
        }

        int left = 0;
        int right = 0;

        int start = 0;
        int end = k - 1;

        boolean isCoupon = false;
        while (true) {
            Set<Integer> set = new HashSet<>();
            for (int i = 0; i < k + 1; i++) {
                if (left == right) right++;
                int leftValue = plate[left];
                int rightValue = plate[right];

//                System.out.println("Start = [" + start + "], End = [" + end + "], " + "Left = [" + left + "], Right = [" + right + "]");
//                System.out.println("Left Value = [" + leftValue + "], Right Value = [" + rightValue + "]");

                if (leftValue == c || rightValue == c) {
                    isCoupon = true;
                }

                set.add(leftValue);
                set.add(rightValue);
                if (leftValue == rightValue) {
                    left++;
                    start++;
                    end++;
//                    right++;
                    isCoupon = false;
                    break;
                } else {
//                    && right == left + 1
                    if (right == end) {
//                        if (!isCoupon) {
//                            System.out.println(set.size() + 1);
//                            return;
//                        } else {
////                            for (int j = left; j <= right; j++) {
////                                System.out.print(plate[j] + " ");
////                            }
////                            System.out.println();
//                            left++;
//
//                            right = left + 1;
//                            isCoupon = false;
//                            break;
//                        }
                        if(right == left + 1) {

                            if(!isCoupon) {
                                System.out.println(set.size() + 1);
                                return;
                            }
//                            for (int j = start; j <= end; j++) {
//                                System.out.print(plate[j] + " ");
//                            }
//                            System.out.println(isCoupon);
                            start++;
                            end++;
                            left = start;
//                            right++;
                            isCoupon = false;
                            break;
                        } else {
                            left++;
                        }
                    } else {
                        right++;
                    }
                }
            }
//            System.out.println(plate.length + " / " + start + " / " + n);
//            System.out.println("===================================================");

            if (start == n) {
                System.out.println(set.size());
                return;
            }
//            if (test == 5) {
//                System.out.println("종료");
//                return;
//            }

        }


    }
}
