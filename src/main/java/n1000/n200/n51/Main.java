package n1000.n200.n51;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 * 단어 나누기 - 1251
 *
 * @author Gumin Jeong
 * @since 2021-08-03
 * @see <a href="https://www.acmicpc.net/problem/1251">문제 출처처/a>
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();

        List<String> reverseWordList = new ArrayList<>();
        for (int i = 1; i < word.length() - 1; i++) {
            for (int j = i + 1; j < word.length(); j++) {
                StringBuilder reverseWord = new StringBuilder();
                reverseWord.append(new StringBuilder(word.substring(0, i)).reverse());
                reverseWord.append(new StringBuilder(word.substring(i, j)).reverse());
                reverseWord.append(new StringBuilder(word.substring(j)).reverse());

                reverseWordList.add(reverseWord.toString());
            }
        }
        reverseWordList.sort(Comparator.naturalOrder());
        System.out.println(reverseWordList.get(0));

    }
}
