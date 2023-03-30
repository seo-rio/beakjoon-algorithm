package level.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

/**
 * @체스판_다시_칠하기 https://www.acmicpc.net/problem/1018
 */
public class PaintChessBoard {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(stk.nextToken());
        int m = Integer.parseInt(stk.nextToken());

        String[] chessBoard = new String[n];

        for (int i = 0; i < n; i++) {
            stk = new StringTokenizer(br.readLine());
            chessBoard[i] = stk.nextToken();
        }

        int totalCount = -1;

        for (int i = 0; i <= n - 8; i++) {
            for (int j = 0; j <= m - 8; j++) {
                char key = 0;
                int count = 0;
                int reversCount = 0;
                for (int k = 0; k < 8; k++) {
                    char[] row = chessBoard[i + k].substring(j, j + 8).toCharArray();
                    key = key == 0 ? row[0] : key == 'B' ? 'W' : 'B';
                    if (key == 'B') {
                        for (int z = 0; z < row.length; z++) {
                            if (z % 2 == 0) {
                                if ('B' != row[z]) {
                                    count++;
                                }
                            } else {
                                if ('W' != row[z]) {
                                    count++;
                                }
                            }

                            if (z % 2 != 0) {
                                if ('B' != row[z]) {
                                    reversCount++;
                                }
                            } else {
                                if ('W' != row[z]) {
                                    reversCount++;
                                }
                            }
                        }
                    } else {
                        for (int z = 0; z < row.length; z++) {
                            if (z % 2 == 0) {
                                if ('W' != row[z]) {
                                    count++;
                                }
                            } else {
                                if ('B' != row[z]) {
                                    count++;
                                }
                            }

                            if (z % 2 != 0) {
                                if ('W' != row[z]) {
                                    reversCount++;
                                }
                            } else {
                                if ('B' != row[z]) {
                                    reversCount++;
                                }
                            }
                        }
                    }

                }
                if (totalCount == -1) {
                    totalCount = Math.min(count, reversCount);
                } else if (totalCount > Math.min(count, reversCount)) {
                    totalCount = Math.min(count, reversCount);
                }
            }
        }
        System.out.println(totalCount);
    }


}
