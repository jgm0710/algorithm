package n10000.n0000.n800.n28;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * 스택 - 10828
 *
 * @author Gumin Jeong
 * @since 2021-08-14
 * @see <a href="https://www.acmicpc.net/problem/10828">문제 출처</a>
 */
public class Main {

    public static Stack<Integer> stack = new Stack<>();
    public static StringBuilder result = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < n; i++) {
            String[] line = bufferedReader.readLine().split(" ");
            String commend = line[0];

            switch (commend) {
                case "push":
                    stack.push(getValue(commend, line));
                    break;
                case "pop":
                    if (stack.empty()) {
                        result.append(-1).append("\n");
                    } else {
                        result.append(stack.pop()).append("\n");
                    }
                    break;
                case "size":
                    result.append(stack.size()).append("\n");
                    break;
                case "empty":
                    if (stack.empty()) {
                        result.append(1).append("\n");
                    } else {
                        result.append(0).append("\n");
                    }
                    break;
                case "top":
                    if (stack.empty()) {
                        result.append(-1).append("\n");
                    } else {
                        result.append(stack.peek()).append("\n");
                    }
                    break;
            }
        }

        System.out.println(result);
    }

    private static int getValue(String commend, String[] line) {
        if (commend.equals("push")) {
            return Integer.parseInt(line[1]);
        }
        return 0;
    }
}
