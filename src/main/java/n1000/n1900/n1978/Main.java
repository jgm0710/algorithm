package n1000.n1900.n1978;

import java.util.Scanner;

/**
 * 소수 찾기 1978
 * <p>
 * - 문제
 * <p>
 * 주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.
 * <p>
 * - 입력
 * <p>
 * 첫 줄에 수의 개수 N이 주어진다. N은 100이하이다. 다음으로 N개의 수가 주어지는데 수는 1,000 이하의 자연수이다.
 * <p>
 * - 출력
 * <p>
 * 주어진 수들 중 소수의 개수를 출력한다.
 *
 * @author Gumin Jeong
 * @see <a href="https://www.acmicpc.net/problem/1978">문제 출처</a>
 * @since 2021-07-25
 */
public class Main {
    public static void main(String[] args) {
        int decimalCount = 0;

        Scanner scanner = new Scanner(System.in);
        // 몇 개의 수를 받을지 선언
        int numberCount = scanner.nextInt();

        for (int i = 0; i < numberCount; i++) {
            int inputNum = scanner.nextInt();

            boolean isDecimal = true;

            if (inputNum==1) {
                continue;
            }

            for (int j = 2; j < inputNum; j++) {
                if (inputNum % j == 0) {
                    isDecimal = false;
                    break;
                }
            }

            if (isDecimal) {
                decimalCount++;
            }
        }

        System.out.println(decimalCount);
    }
}
