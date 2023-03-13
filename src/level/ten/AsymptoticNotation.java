package level.ten;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AsymptoticNotation {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine(), " ");
        int a1 = Integer.parseInt(stk.nextToken());
        int a2 = Integer.parseInt(stk.nextToken());

        stk = new StringTokenizer(br.readLine());
        int c = Integer.parseInt(stk.nextToken());

        stk = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(stk.nextToken());


        if((a1 * n) + a2 <= c * n && c - a1 >= 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
