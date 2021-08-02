package n10000.n1000.n600.n51;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * 좌표 정렬하기 2 - 11651
 *
 * @author Gumin Jeong
 * @see <a href="https://www.acmicpc.net/problem/11651">문제 출처</a>
 * @since 2021-08-02
 */
public class Main {

    static class Point {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }


    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine());

        List<Point> pointList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] line = bufferedReader.readLine().split(" ");
            Point point = new Point(Integer.parseInt(line[0]), Integer.parseInt(line[1]));
            pointList.add(point);
        }

        pointList.sort((o1, o2) -> {
            if (o1.y < o2.y) {
                return -1;
            } else if (o1.y > o2.y) {
                return 1;
            } else {
                return Integer.compare(o1.x, o2.x);
            }
        });

        StringBuilder result = new StringBuilder();
        pointList.forEach(point -> result.append(point.x).append(" ").append(point.y).append("\n"));

        System.out.println(result);
    }
}
