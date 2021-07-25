package n9000.n9000.n9093;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 단어 뒤집기 9093
 * <p>
 * - 문제
 * <p>
 * 문장이 주어졌을 때, 단어를 모두 뒤집어서 출력하는 프로그램을 작성하시오. 단, 단어의 순서는 바꿀 수 없다. 단어는 영어 알파벳으로만 이루어져 있다.
 * <p>
 * - 입력
 * <p>
 * 첫째 줄에 테스트 케이스의 개수 T가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있으며, 문장이 하나 주어진다. 단어의 길이는 최대 20, 문장의 길이는 최대 1000이다. 단어와 단어 사이에는 공백이 하나 있다.
 * <p>
 * - 출력
 * <p>
 * 각 테스트 케이스에 대해서, 입력으로 주어진 문장의 단어를 모두 뒤집어 출력한다.
 * <p>
 *
 * @author Gumin Jeong
 * @see <a href="https://www.acmicpc.net/problem/9093">문제 출처</a>
 * @since 2021-07-25
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sentencesCount = scanner.nextInt();
        scanner.nextLine();

        List<String> results = new ArrayList<>();
        List<String> reversWords = new ArrayList<>();

        for (int i = 0; i < sentencesCount; i++) {
            String sentences = scanner.nextLine();

            while (true) {
                int blankIndex = sentences.indexOf(' ');
                if (blankIndex == -1) {
                    reversWords.add(new StringBuilder(sentences).reverse().toString());
                    break;
                }

                String word = sentences.substring(0, blankIndex);
                reversWords.add(new StringBuilder(word).reverse().toString());

                sentences = sentences.substring(blankIndex + 1);
            }

            StringBuilder result = new StringBuilder();
            for (String reversWord : reversWords) {
                result.append(reversWord).append(" ");
            }
            results.add(result.substring(0, result.length() - 1));
            reversWords.clear();
        }

        results.forEach(System.out::println);
    }
}
