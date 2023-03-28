package level.advancedone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @그룹_단어_체커 https://www.acmicpc.net/problem/1316
 */
public class GroupWordChecker {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());

        int wordCount = Integer.parseInt(stk.nextToken());

        int count = wordCount;
        for (int i = 0; i < wordCount; i++) {
            stk = new StringTokenizer(br.readLine());
            String word = stk.nextToken();

            for (int j = 0; j < word.length(); j++) {
                char alphabet = word.charAt(j);
                int start = word.indexOf(alphabet);
                int end = word.lastIndexOf(alphabet);
                boolean isGroup = true;

                for (int k = start + 1; k < end; k++) {
                    if(word.charAt(k) != alphabet) {
                        isGroup = false;
                        break;
                    }
                }

                if(!isGroup) {
                    count--;
                    break;
                }

            }

        }
        System.out.println("count => " + count);
    }


}
