package n1000.n400.n75;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


/**
 * 방 번호 - 1475
 *
 * @author Gumin Jeong
 * @see <a href="https://www.acmicpc.net/problem/1475">문제 출처</a>
 * @since 2021-08-11
 */
public class Main {

    public static int[] numbersCount = new int[9];

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] line = bufferedReader.readLine().split("");

        for (String s : line) {
            int number = Integer.parseInt(s);
            if (number == 9) {
                number = 6;
            }
            numbersCount[number]++;
        }

        numbersCount[6] = (numbersCount[6]) / 2 + (numbersCount[6] % 2);

        int max = Arrays.stream(numbersCount).max().getAsInt();

        System.out.println(max);
    }
}
