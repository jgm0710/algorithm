package n2000.n300.n38;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * 긴자리 계산  - 2338
 *
 * @author Gumin Jeong
 * @see <a href="https://www.acmicpc.net/problem/2338">문제 출처</a>
 * @since 2021-07-31
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger a = new BigInteger(scanner.next());
        BigInteger b = new BigInteger(scanner.next());

        System.out.println(a.add(b));
        System.out.println(a.subtract(b));
        System.out.println(a.multiply(b));
    }
}
