package n1000.n1900.n20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

/**
 * 수 찾기 - 1920
 *
 * @author Gumin Jeong
 * @since 2021-08-15
 * @see <a href="https://www.acmicpc.net/problem/1920">문제 출처</a>
 */
public class Main {

    public static HashSet<Integer> numbersSet = new HashSet<>();
    public static StringBuilder result = new StringBuilder();


    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine());

        String[] line = bufferedReader.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            numbersSet.add(Integer.valueOf(line[i]));
        }

        int m = Integer.parseInt(bufferedReader.readLine());
        String[] line2 = bufferedReader.readLine().split(" ");
        for (int i = 0; i < m; i++) {
            if (numbersSet.contains(Integer.parseInt(line2[i]))) {
                result.append(1).append("\n");
            } else {
                result.append(0).append("\n");
            }
        }

        System.out.println(result);
        bufferedReader.close();
    }
}
