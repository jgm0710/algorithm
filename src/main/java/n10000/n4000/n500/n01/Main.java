package n10000.n4000.n500.n01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 퇴사 - 14501
 *
 * @author Gumin Jeong
 * @see <a href="https://www.acmicpc.net/problem/14501">문제 출처</a>
 * @since 2021-08-16
 */
public class Main {

    public static List<Consulting> consultingList = new ArrayList<>();

    static class Consulting {
        int startDay;
        int endDay;
        int fee;

        public Consulting(int startDay, int days, int fee) {
            this.startDay = startDay;
            this.endDay = startDay + days - 1;
            this.fee = fee;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine());

        for (int i = 1; i <= n; i++) {
            String[] line = bufferedReader.readLine().split(" ");

            int t = Integer.parseInt(line[0]);
            int p = Integer.parseInt(line[1]);

            Consulting consulting = new Consulting(i, t, p);
            consultingList.add(consulting);
        }

        List<Consulting> removeList = consultingList.stream().filter(consulting -> consulting.endDay == n + 1).collect(Collectors.toList());
        consultingList.removeAll(removeList);

//        while (true) {
//            Consulting first = consultingList.get(0);
//
//            for (int i = 1; i < consultingList.size(); i++) {
//                Consulting tmp = consultingList.get(i);
//
//
//            }
//        }

        bufferedReader.close();
    }
}
