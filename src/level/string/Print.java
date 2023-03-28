package level.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @그대로_출력하기 https://www.acmicpc.net/problem/11718
 */
public class Print {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while ((s = br.readLine()) != null) {
            System.out.println(s);
        }

    }
}
