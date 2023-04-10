package level.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.StringTokenizer;

/**
 * @알고리즘_수업_-_깊이_우선_탐색_1 https://www.acmicpc.net/problem/24479
 */
public class DfsOne {

    static int order = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(stk.nextToken());
        int m = Integer.parseInt(stk.nextToken());
        int r = Integer.parseInt(stk.nextToken());

        int[][] graph = new int[n][n];
        int[] visited = new int[n];

        for (int i = 0; i < m; i++) {
            stk = new StringTokenizer(br.readLine(), " ");
            int num1 = Integer.parseInt(stk.nextToken());
            int num2 = Integer.parseInt(stk.nextToken());
            graph[num1 - 1][num2 - 1] = 1;
            graph[num2 - 1][num1 - 1] = 1;

        }

        System.out.println(Arrays.deepToString(graph));
        dfs(r - 1, visited, graph);

        Arrays.stream(visited).forEach(System.out::println);
    }

    static void dfs(int index, int[] visited, int[][] adjArray) {
        int l = adjArray.length;
        visited[index] = order++;

        for (int i = 0; i < l; i++) {
            if (adjArray[index][i] == 1 && visited[i] == 0) {
                dfs(i, visited, adjArray);
                return;
            }
        }
    }
}
