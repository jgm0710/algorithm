package n10000.n1000.n600.n53;

import java.util.Scanner;

/**
 * 소인수분해 - 11653
 *
 * @author Gumin Jeong
 * @see <a href="https://www.acmicpc.net/problem/11653">문제 출처</a>
 * @since 2021-08-18
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();

        StringBuilder result = new StringBuilder();

        while (n != 1) {
            for (int i = 2; i <= n; i++) {
                if (n % i == 0) {
                    result.append(i).append("\n");
                    n /= i;
                    break;
                }
            }
        }

        System.out.print(result);
    }
}
