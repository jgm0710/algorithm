package n9000.n000.n12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * 괄호 - 9012
 *
 * @author Gumin Jeong
 * @since 2021-08-15
 * @see <a href="https://www.acmicpc.net/problem/9012">문제 출처</a>
 */
public class Main {

    public static final char open = '(';
    public static final char close = ')';

    public static Stack<Character> characterStack = new Stack<>();
    public static StringBuilder result = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < t; i++) {
            char[] chars = bufferedReader.readLine().toCharArray();

            characterStack.clear();

            for (char parentheses : chars) {
                if (!characterStack.empty() && characterStack.peek() == open && parentheses == close) {
                    characterStack.pop();
                } else {
                    characterStack.push(parentheses);
                }
            }

            if (characterStack.empty()) {
                result.append("YES").append("\n");
            } else {
                result.append("NO").append("\n");
            }
        }

        bufferedReader.close();
        System.out.println(result);
    }
}
