package n10000.n1000.n700.n23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Set 으로 풀었을 때가 조금 더 빠름
 *
 * @author Gumin Jeong
 * @since 2021-08-13
 */
public class Main2 {

    // 값이 0이면 비어있는 것, 1이면 들어있는 것
    public static int[] set = new int[21];

    public static StringBuilder result = new StringBuilder();

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

            switch (cal) {
                case "add":
                    set[number] = 1;
                    break;
                case "remove":
                    set[number] = 0;
                    break;
                case "check":
                    result.append(set[number]).append("\n");
                    break;
                case "toggle":
                    if (set[number] == 0) {
                        set[number] = 1;
                    } else {
                        set[number] = 0;
                    }
                    break;

                case "all":
                    Arrays.fill(set, 1);
                    break;
                case "empty":
                    Arrays.fill(set, 0);
                    break;
            }
        }

        bufferedReader.close();

        System.out.println(result);
    }
}