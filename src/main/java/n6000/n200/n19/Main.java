package n6000.n200.n19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 소수의 자격  - 6219
 *
 *
 * @author Gumin Jeong
 * @see <a href="https://www.acmicpc.net/problem/6219">문제 출처</a>
 * @since 2021-08-09
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] line = bufferedReader.readLine().split(" ");

        int a = Integer.parseInt(line[0]);
        int b = Integer.parseInt(line[1]);

        String d = line[2];

        int result = 0;

        for (int i = a; i <= b; i++) {
            if (!String.valueOf(i).contains(d)) {
                continue;
            }

            int sqrtI = (int) Math.sqrt(i) + 1;

            boolean decimalFlag = true;

            for (int j = 2; j < sqrtI; j++) {
                if (i % j == 0) {
                    decimalFlag = false;
                    break;
                }
            }

            if (decimalFlag) {
                result++;
            }
        }

        System.out.println(result);
    }
}
