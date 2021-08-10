package n1000.n400.n36;

import java.util.Scanner;

/**
 * 영화감독 숌  - 1436
 *
 * @author Gumin Jeong
 * @see <a href="https://www.acmicpc.net/problem/1436">문제 출처</a>
 * @since 2021-08-10
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int number = 0;

        while (true) {
            String numberString = String.valueOf(number);
            if (numberString.contains("666")) {
                n--;
            }

            if (n == 0) {
                break;
            }

            number++;
        }

        System.out.println(number);

    }
}
