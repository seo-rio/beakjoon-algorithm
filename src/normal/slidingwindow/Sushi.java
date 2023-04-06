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

        int count = 0;

        for (int i = 0; i < n; i++) {
            stk = new StringTokenizer(br.readLine());
            plate[i] = Integer.parseInt(stk.nextToken());
            if (i + n < plate.length) {
                plate[i + n] = plate[i];
            }
        }

        List<Integer> pick = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < k; i++) {
            pick.add(plate[i]);
        }

        System.out.println("PICK => " + pick);

        for (int i = 0; i < pick.size(); i++) {
            if (map.get(pick.get(i)) != null) {
                map.put(pick.get(i), map.get(pick.get(i)) + 1);
            } else {
                map.put(pick.get(i), 1);
            }
        }

        System.out.println(map);

        int cursor = pick.size() - 1;
        int result = 0;
        while (true) {

            Integer first = map.get(pick.get(0));
            if(first - 1 == 0) {
                map.remove(pick.get(0));
            } else {
                map.put(pick.get(0), first - 1);
            }

            pick.remove(0);
            pick.add(plate[++cursor]);

            Integer integer = map.get(pick.get(pick.size() - 1));
            map.put(pick.get(pick.size() - 1), integer == null ? 1 : integer + 1);

            if(!map.containsKey(c)) {
                map.put(c, 1);
            }
            System.out.println("PICK => " + pick);

            System.out.println(map);


            System.out.println("========================================" + map.size() + " / " + (k + 1)) ;

            result = result == 0 ? map.size() : Math.max(result, map.size());
            if (map.size() == k + 1) {
                System.out.println(result);
                return;
            }
            if (cursor + 1 == plate.length) {
                System.out.println(result);
                return;
            }

        }


    }
}

/*
10 6 6 25
1
1
2
4
1
25
25
1
9
2
*/
