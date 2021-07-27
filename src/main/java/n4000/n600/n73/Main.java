package n4000.n600.n73;

import java.util.ArrayList;
import java.util.List;

/**
 * 셀프 넘버 - 4673
 * <p>
 * - 문제
 * <p>
 * 셀프 넘버는 1949년 인도 수학자 D.R. Kaprekar가 이름 붙였다. 양의 정수 n에 대해서 d(n)을 n과 n의 각 자리수를 더하는 함수라고 정의하자. 예를 들어, d(75) = 75+7+5 = 87이다.
 * <p>
 * 양의 정수 n이 주어졌을 때, 이 수를 시작해서 n, d(n), d(d(n)), d(d(d(n))), ...과 같은 무한 수열을 만들 수 있다.
 * <p>
 * 예를 들어, 33으로 시작한다면 다음 수는 33 + 3 + 3 = 39이고, 그 다음 수는 39 + 3 + 9 = 51, 다음 수는 51 + 5 + 1 = 57이다. 이런식으로 다음과 같은 수열을 만들 수 있다.
 * <p>
 * 33, 39, 51, 57, 69, 84, 96, 111, 114, 120, 123, 129, 141, ...
 * <p>
 * n을 d(n)의 생성자라고 한다. 위의 수열에서 33은 39의 생성자이고, 39는 51의 생성자, 51은 57의 생성자이다. 생성자가 한 개보다 많은 경우도 있다. 예를 들어, 101은 생성자가 2개(91과 100) 있다.
 * <p>
 * 생성자가 없는 숫자를 셀프 넘버라고 한다. 100보다 작은 셀프 넘버는 총 13개가 있다. 1, 3, 5, 7, 9, 20, 31, 42, 53, 64, 75, 86, 97
 * <p>
 * 10000보다 작거나 같은 셀프 넘버를 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
 * <p>
 * - 입력
 * <p>
 * 입력은 없다.
 * <p>
 * - 출력
 * <p>
 * 10,000보다 작거나 같은 셀프 넘버를 한 줄에 하나씩 증가하는 순서로 출력한다.
 *
 * @author Gumin Jeong
 * @see <a href="https://www.acmicpc.net/problem/4673">문제 출처</a>
 * @since 2021-07-27
 */
public class Main {

    public static void main(String[] args) {
        int range = 10000;

        List<Integer> selfNumbers = new ArrayList<>();
        selfNumbers.add(1);

        for (int i = 2; i <= range; i++) {
            boolean selfNumberFlag = true;

            for (int j = 1; j < i; j++) {
                if (getDn(j) == i) {
                    selfNumberFlag = false;
                    break;
                }
            }

            if (selfNumberFlag) {
                selfNumbers.add(i);
            }
        }

        selfNumbers.forEach(System.out::println);
    }

    private static int getDn(int number) {
        int result = number;

        while (true) {
            result += number % 10;
            if ((number /= 10) == 0) {
                return result;
            }
        }
    }
}
