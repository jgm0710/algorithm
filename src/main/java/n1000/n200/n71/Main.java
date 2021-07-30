package n1000.n200.n71;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/**
 * 엄청난 부자2 - 1271
 *
 * @author Gumin Jeong
 * @see <a href="https://www.acmicpc.net/problem/1271">문제 출처</a>
 * @since 2021-07-30
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = bufferedReader.readLine().split(" ");

        BigInteger money = new BigInteger(inputs[0]),
                livingThingsCount = new BigInteger(inputs[1]);

        BigInteger[] bigIntegers = money.divideAndRemainder(livingThingsCount);
        System.out.println(bigIntegers[0]);
        System.out.println(bigIntegers[1]);
    }
}
