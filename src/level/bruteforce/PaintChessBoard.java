package level.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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

        String key = "";
        String revereKey = "";

        int count = 0;
        int reversCount = 0;

        for (int i = 0; i < n; i++) {
            stk = new StringTokenizer(br.readLine());
            chessBoard[i] = stk.nextToken();
            if (i == 0) {
                key = String.valueOf(chessBoard[i].charAt(0));
                revereKey = String.valueOf(chessBoard[i].charAt(m - 1));
            } else {
                key = key.equals("W") ? "B" : "W";
                revereKey = revereKey.equals("W") ? "B" : "W";

            }

//            String normal = "";
            System.out.println("Key => " + key);
            System.out.println("revereKey => " + revereKey);

            for (int j = 0; j < m; j++) {
                String color = String.valueOf(chessBoard[i].charAt(j));
                System.out.println("origin" + j % 2 + " === color : " + color);
                if (key.equals("W")) {
                    if (j % 2 == 0) {
                        if (!color.equals("W")) {
                            count++;
                        }
                    } else {
                        if (!color.equals("B")) {
                            count++;
                        }
                    }
                } else if (key.equals("B")) {
                    if (j % 2 == 0) {
                        if (!color.equals("B")) {
                            count++;
                        }
                    } else {
                        if (!color.equals("W")) {
                            count++;
                        }
                    }
                }
            }

            for (int j = m - 1; j >= 0; j--) {
                String color = String.valueOf(chessBoard[i].charAt(j));
                System.out.println("revers " + j % 2 + " === color : " + color);
                if (revereKey.equals("W")) {
                    if (j % 2 == 0) {
                        if (!color.equals("W")) {
                            reversCount++;
                        }
                    } else {
                        if (!color.equals("B")) {
                            reversCount++;
                        }
                    }
                } else if (revereKey.equals("B")) {
                    if (j % 2 == 0) {
                        if (!color.equals("B")) {
                            reversCount++;
                        }
                    } else {
                        if (!color.equals("W")) {
                            reversCount++;
                        }
                    }
                }
            }

            System.out.println("Middle count => " + count);
            System.out.println("Middle reversCount count => " + reversCount);

        }

        System.out.println("count => " + count);
    }


}
