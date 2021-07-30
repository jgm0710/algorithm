package n2000.n800.n39;

import java.util.Scanner;

/**
 * 설탕 배달 - 2839
 *
 * @author Gumin Jeong
 * @see <a href="https://www.acmicpc.net/problem/2839">문제 출처</a>
 * @since 2021-07-30
 */
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int fiveCount = (n / 5) + 1;
        int threeCount = 0;

        int loopCount = fiveCount;

        boolean failFlag = true;

        for (int i = 0; i <= loopCount; i++) {
            int sum = (fiveCount * 5) + (threeCount * 3);
            if (n == sum) {
                failFlag = false;
                break;
            } else {
                fiveCount--;
                int remainingK = n - (fiveCount * 5);
                threeCount = remainingK / 3;
            }
        }

        if (failFlag) {
            System.out.println(-1);
        } else {
            System.out.println(fiveCount + threeCount);
        }
    }
}
