package n10000.n0000.n800.n45;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 큐 - 10845
 *
 * @author Gumin Jeong
 * @see <a href="https://www.acmicpc.net/problem/10845">문제 출처</a>
 * @since 2021-08-15
 */
public class Main {

    public static Deque<Integer> integerDeque = new ArrayDeque<>();
    public static StringBuilder result = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < n; i++) {
            String[] line = bufferedReader.readLine().split(" ");

            String commend = line[0];

            switch (commend) {
                case "push":
                    integerDeque.add(getValue(line));
                    break;
                case "pop":
                    if (integerDeque.isEmpty()) {
                        result.append(-1).append("\n");
                    } else {
                        result.append(integerDeque.pollFirst()).append("\n");
                    }
                    break;
                case "size":
                    result.append(integerDeque.size()).append("\n");
                    break;
                case "empty":
                    if (integerDeque.isEmpty()) {
                        result.append(1).append("\n");
                    } else {
                        result.append(0).append("\n");
                    }
                    break;
                case "front":
                    if (integerDeque.isEmpty()) {
                        result.append(-1).append("\n");
                    } else {
                        result.append(integerDeque.peekFirst()).append("\n");
                    }
                    break;
                case "back":
                    if (integerDeque.isEmpty()) {
                        result.append(-1).append("\n");
                    } else {
                        result.append(integerDeque.peekLast()).append("\n");
                    }
                    break;
            }
        }

        bufferedReader.close();

        System.out.println(result);
    }

    private static int getValue(String[] line) {
        return Integer.parseInt(line[1]);
    }
}
