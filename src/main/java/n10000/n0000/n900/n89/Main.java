package n10000.n0000.n900.n89;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 수 정렬하기 3 - 10989
 *
 * - inputStream 을 한 번에 받아 입력 최적화
 * - String 을 한 번에 응답하여 출력 최적화
 *
 * @author Gumin Jeong
 * @see <a href="https://www.acmicpc.net/problem/10989">문제 출처</a>
 * @since 2021-07-28
 */
public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int inputCount = Integer.parseInt(bufferedReader.readLine());

        int[] numbersCounts = new int[10001];


        for (int i = 0; i < inputCount; i++) {
            int n = Integer.parseInt(bufferedReader.readLine());
            numbersCounts[n]++;
        }

        bufferedReader.close();

        StringBuffer stringBuffer = new StringBuffer();

        for (int i = 0; i < numbersCounts.length; i++) {
            for (int j = 0; j < numbersCounts[i]; j++) {
                stringBuffer.append(i).append("\n");
            }
        }

        System.out.print(stringBuffer);
    }
}
