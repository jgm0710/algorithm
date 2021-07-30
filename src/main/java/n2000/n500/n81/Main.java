package n2000.n500.n81;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 소수 - 2581
 *
 * @author Gumin Jeong
 * @see <a href="https://www.acmicpc.net/problem/2581">문제 출처</a>
 * @since 2021-07-30
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startRange = scanner.nextInt();
        int endRange = scanner.nextInt();

        List<Integer> decimals = new ArrayList<>();

        for (int i = startRange; i <= endRange; i++) {
            if (i == 1) {
                continue;
            }

            if (i == 2) {
                decimals.add(i);
                continue;
            }

            boolean decimalFlag = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    decimalFlag = false;
                    break;
                }
            }
            if (decimalFlag) {
                decimals.add(i);
            }
        }

        if (decimals.size() == 0) {
            System.out.println(-1);
        } else {
            System.out.println(decimals.stream().mapToLong(integer -> integer).sum());
            System.out.println(decimals.get(0));
        }
    }
}
