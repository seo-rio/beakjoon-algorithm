package level.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @팩토리얼_2 https://www.acmicpc.net/problem/27433
 */
public class FactorialTwo {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long num = Integer.parseInt(br.readLine());

        if(num == 0) {
            System.out.println(1);
        } else {
            System.out.println(factorial(num));

        }

    }


    // (5-1) * 5 -> (4-1) * 4 -> (3-1) * 3 -> (2-1) * 2 -> 1
    // 1 * 2 -> 2 * 3 -> 6 * 4 -> 24 * 5 -> 120
    // 5 * 24 -> 4 * 6 -> 3 * 2 -> 2 * 1 -> 1 * 1
    // 120    -> 24    -> 6     -> 2     -> 1
    static long factorial(long num) {
        System.out.println("NUM => " + num);
        if (num == 1) {
            return num;
        } else {
            long value =  factorial(num - 1);
            System.out.println("num * " + num + " value => " + value);
            return value * num;
        }
    }
}
