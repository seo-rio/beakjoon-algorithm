package normal.slidingwindow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Stream;

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
            if (i + n < plate.length) {
                plate[i + n] = plate[i];
            }
        }

        List<Integer> pick = new LinkedList<>();

        for (int i = 0; i < k; i++) {
            pick.add(plate[i]);
        }

        System.out.println("PIC => " + pick);

        int cursor = pick.size() - 1;
        while (true) {
            int left = 0;
            int right = 1;

            pick.remove(0);
            pick.add(plate[++cursor]);


//            if(!pick.contains(c)) {
//                pick.add(c);
//            }

            System.out.println("PIC => " + pick);

//

//            HashSet<Integer> set = new HashSet<>(pick);
//            set.add(c);
//            System.out.println("SET => " + set + ", Size => " + set.size());
            System.out.println("========================================");
//            if(set.size() == k + 1) {
//                System.out.println(k + 1);
//                return;
//            }
            if (cursor + 1 == plate.length) {
                System.out.println(pick.size());
                return;
            }

        }


    }
}
