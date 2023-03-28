package level.advancedone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @크로아티아_알파벳 https://www.acmicpc.net/problem/2941
 */
public class CroatianAlphabet {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());

        String[] crtAlphabet = new String[]{"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        String word = stk.nextToken();

        int count = 0;

        for (int i = 0; i < crtAlphabet.length; i++) {
            int findIndex = word.indexOf(crtAlphabet[i]);
            if(findIndex >= 0) {
                word = word.replaceFirst(crtAlphabet[i], " ");
                count++;
                i--;
            }
        }

        word = word.replaceAll(" ", "");
        count += word.length();

        System.out.println(count);

    }
}
