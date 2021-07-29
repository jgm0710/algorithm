package n1000.n100.n81;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * 단어 정렬 - 1181
 *
 * @author Gumin Jeong
 * @since 2021-07-29
 * @see <a href="https://www.acmicpc.net/problem/1181">문제 출처</a>
 */
public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int inputCount = Integer.parseInt(bufferedReader.readLine());

        List<String> words = new ArrayList<>();

        for (int i = 0; i < inputCount; i++) {
            String word = bufferedReader.readLine();
            if (!words.contains(word)) {
                words.add(word);
            }
        }

        bufferedReader.close();

        words.sort((o1, o2) -> {
            if (o1.length() < o2.length()) {
                return -1;
            } else if (o1.length() > o2.length()) {
                return 1;
            } else {
                return o1.compareTo(o2);
            }
        });

        StringBuilder result = new StringBuilder();
        words.forEach(s -> result.append(s).append("\n"));

        System.out.print(result);
    }
}
