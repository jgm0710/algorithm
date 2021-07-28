package n10000.n0000.n900.n89;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 수 정렬하기 3 - 10989
 *
 * @author Gumin Jeong
 * @see <a href="https://www.acmicpc.net/problem/10989">문제 출처</a>
 * @since 2021-07-28
 */
public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int inputCount = Integer.parseInt(bufferedReader.readLine());

        String[] results = new String[10001];

        for (int i = 0; i < inputCount; i++) {
            int n = Integer.parseInt(bufferedReader.readLine());
            if (results[n] == null) {
                results[n] = n + "\n";
            } else {
                results[n] += n + "\n";
            }
        }

        bufferedReader.close();

        for (int i = 0; i < results.length; i++) {
            if (results[i] != null) {
                System.out.println(results[i].substring(0, results[i].length() - 1));
            }
        }
    }
}
