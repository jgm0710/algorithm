package n1000.n000.n37;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 약수 - 1037 (실패)
 *
 * @author Gumin Jeong
 * @see <a href="https://www.acmicpc.net/problem/1037">문제 출처</a>
 * @since 2021-08-10
 */
public class Main {

    public static int[] numbers;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(bufferedReader.readLine());

        numbers = new int[t];

        String[] line = bufferedReader.readLine().split(" ");

        for (int i = 0; i < t; i++) {
            numbers[i] = Integer.parseInt(line[i]);
        }

        int min = Arrays.stream(numbers).min().getAsInt();

        List<Integer> commonFactors = new ArrayList<>();

        while (true) {

            int commonFactor = 1;
            boolean existCommon = false;

            for (int i = 2; i <= min; i++) {
                boolean commonFlag = true;

                // numbers[0~t] 까지 공통으로 나뉘는 수 있는지 찾기
                for (int j = 0; j < t; j++) {
                    if (numbers[j] % i != 0) {
                        commonFlag = false;
                        break;
                    }
                }

                // 최대 공약수인 경우
                if (commonFlag) {
                    commonFactor = i;
                    commonFactors.add(i);
                    existCommon = true;
                    break;
                }
            }

            if (!existCommon) {
                break;
            }

            for (int i = 0; i < t; i++) {
                numbers[i] /= commonFactor;
                if (numbers[i] < min) {
                    min = numbers[i];
                }
            }
        }

        int result = 1;
        for (Integer commonFactor : commonFactors) {
            result *= commonFactor;
        }

        for (int i = 0; i < t; i++) {
            result *= numbers[i];
        }

        System.out.println(result);
    }
}
