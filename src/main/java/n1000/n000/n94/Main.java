package n1000.n000.n94;

import java.util.Scanner;

/**
 * 막대기 - 1094
 *
 * @author Gumin Jeong
 * @see <a href="https://www.acmicpc.net/problem/1094">문제 출처</a>
 * @since 2021-08-13
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();

        int result = 0;

        while (true) {
            if (x % 2 == 1) {
                result++;
            }

            if (x == 1) {
                break;
            }

            x /= 2;
        }

        System.out.println(result);
    }
}
