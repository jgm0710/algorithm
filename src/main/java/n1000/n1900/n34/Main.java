package n1000.n1900.n34;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * 최소공배수 - 1934
 *
 * @author Gumin Jeong
 * @see <a href="https://www.acmicpc.net/problem/1934">문제 출처</a>
 * @since 2021-08-02
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine());


        List<Long> results = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            long result = 1;

            String[] line = bufferedReader.readLine().split(" ");
            int a = Integer.parseInt(line[0]);
            int b = Integer.parseInt(line[1]);

            int min = Math.min(a, b);

            while (true) {
                boolean endFlag = true;
                for (int j = 2; j <= min; j++) {
                    if (a % j == 0 && b % j == 0) {
                        result *= j;
                        a /= j;
                        b /= j;
                        min = Math.min(a, b);
                        endFlag = false;
                        break;
                    }
                }

                if (endFlag) {
                    result *= a;
                    result *= b;
                    results.add(result);
                    break;
                }
            }
        }

        StringBuilder resultString = new StringBuilder();
        results.forEach(resultLong -> resultString.append(resultLong).append("\n"));
        System.out.println(resultString);
    }

}
