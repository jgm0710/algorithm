package others;

import java.util.Scanner;

/**
 * jsk 가 낸 문제
 *
 * - 정수를 입력 받아 2진수로 변환 -> 2진수 1의 개수가 얼마나 있는지 출력
 *
 * @author Gumin Jeong
 * @since 2021-07-30
 */
public class DecimalToBinary {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int decimal = scanner.nextInt();

        long oneCount = 0;

        do {
            int binary = decimal % 2;
            if (binary == 1) {
                oneCount++;
            }
        } while ((decimal /= 2) != 0);

        System.out.println(oneCount);
    }
}
