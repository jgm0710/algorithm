package n10000.n1000.n600.n50;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * 좌표 정렬하기 성공 - 11650
 *
 * @author Gumin Jeong
 * @see <a href="https://www.acmicpc.net/problem/11650">문제 출처</a>
 * @since 2021-07-30
 */
public class Main {

    static class Coordinates {
        int x;
        int y;

        public Coordinates(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int inputCount = Integer.parseInt(bufferedReader.readLine());


        List<Coordinates> coordinatesList = new ArrayList<>();
        for (int i = 0; i < inputCount; i++) {
            String[] numbers = bufferedReader.readLine().split(" ");
            coordinatesList.add(new Coordinates(Integer.parseInt(numbers[0]), Integer.parseInt(numbers[1])));
        }

        coordinatesList.sort((o1, o2) -> {
            if (o1.getX() > o2.getX()) {
                return 1;
            } else if (o1.getX() < o2.getX()) {
                return -1;
            } else {
                return o1.getY() < o2.getY() ? -1 : 1;
            }
        });

        StringBuilder result = new StringBuilder();

        coordinatesList.forEach(coordinates -> result.append(coordinates.getX()).append(" ").append(coordinates.getY()).append("\n"));

        System.out.print(result);
    }
}
