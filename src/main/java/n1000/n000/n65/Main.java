package n1000.n000.n65;

import java.util.Scanner;

/**
 * 한수 - 1065
 *
 * @author Gumin Jeong
 * @since 2021-08-14
 * @see <a href="https://www.acmicpc.net/problem/1065">문제 출처</a>
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int result = 0;
        for (int i = 1; i <= n; i++) {
            if (i < 10) {
                result++;
                continue;
            }

            String[] slicingNumbers = String.valueOf(i).split("");
            int differenceValue = 100000;
            boolean isArithmeticSequence = true;

            for (int j = 0; j < slicingNumbers.length-1; j++) {
                int nowNumber = Integer.parseInt(slicingNumbers[j]);
                int nextNumber = Integer.parseInt(slicingNumbers[j + 1]);

                if (differenceValue == 100000) {
                    differenceValue = nextNumber - nowNumber;
                } else {
                    if (differenceValue != (nextNumber - nowNumber)) {
                        isArithmeticSequence = false;
                        break;
                    }
                }
            }

            if (isArithmeticSequence) {
                result++;
            }
        }

        System.out.println(result);
    }
}
