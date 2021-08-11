package n1000.n400.n76;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 날짜 계산 - 1476
 *
 * @author Gumin Jeong
 * @see <a href="https://www.acmicpc.net/problem/1476">문제 출처</a>
 * @since 2021-08-11
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] line = bufferedReader.readLine().split(" ");

        bufferedReader.close();

        int inputE = Integer.parseInt(line[0]);
        int inputS = Integer.parseInt(line[1]);
        int inputM = Integer.parseInt(line[2]);

        int result = 1;
        while (true) {

            int e = getTransNumber(result,15);
            int s = getTransNumber(result,28);
            int m = getTransNumber(result, 19);

            if (e == inputE && s == inputS && m == inputM) {
                break;
            }

            result++;
        }

        System.out.println(result);
    }

    private static int getTransNumber(int result, int range) {
        int transNumber = result % range;
        if (transNumber == 0) {
            return range;
        } else {
            return transNumber;
        }
    }

}
