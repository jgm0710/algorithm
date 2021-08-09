package n1000.n500.n44;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * 사이클 단어 - 1544
 *
 * @author Gumin Jeong
 * @see <a href="https://www.acmicpc.net/problem/1544">문제 출처</a>
 * @since 2021-08-09
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine());

        List<String> words = new ArrayList<>();
        words.add(bufferedReader.readLine());

        for (int i = 1; i < n; i++) {
            String newWord = bufferedReader.readLine();

            boolean containsFlag = false;
            for (String word : words) {
                if (word.length() == newWord.length()) {
                    String twiceWord = word + word;
                    if (twiceWord.contains(newWord)) {
                        containsFlag = true;
                        break;
                    }
                }
            }

            if (!containsFlag) {
                words.add(newWord);
            }
        }

        System.out.println(words.size());
    }
}
