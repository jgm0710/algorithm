package n10000.n1000.n700.n23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

/**
 * 집합 - 11723
 *
 * @author Gumin Jeong
 * @see <a href="https://www.acmicpc.net/problem/11723">문제 출처</a>
 * @since 2021-08-13
 */
public class Main {

    public static StringBuilder result = new StringBuilder();

    public static Set<Integer> hs = new HashSet<>();

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int m = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < m; i++) {
            String[] line = bufferedReader.readLine().split(" ");
            String cal = line[0];
            int number;

            if (cal.equals("all") || cal.equals("empty")) {
                number = 0;
            } else {
                number = Integer.parseInt(line[1]);
            }

            calculate(cal, number);
        }

        System.out.println(result);
    }

    private static void calculate(String cal, int number) {
        switch (cal) {
            case "add":
                hs.add(number);
                break;
            case "remove":
                hs.remove(number);
                break;
            case "check":
                if (hs.contains(number)) {
                    result.append(1).append("\n");
                } else {
                    result.append(0).append("\n");
                }
                break;
            case "toggle":
                if (hs.contains(number)) {
                    hs.remove(number);
                } else {
                    hs.add(number);
                }
                break;
            case "all":
                hs.clear();
                for (int i = 1; i <= 20; i++) {
                    hs.add(i);
                }
                break;
            case "empty":
                hs.clear();
                break;
        }
    }
}
