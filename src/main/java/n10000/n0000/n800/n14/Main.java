package n10000.n0000.n800.n14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * 나이순 정렬 - 10814
 *
 * @author Gumin Jeong
 * @see <a href="https://www.acmicpc.net/problem/10814">문제 출처</a>
 * @since 2021-08-02
 */
public class Main {

    static class Person {
        int age;
        String name;
        int sequence;

        public Person(int age, String name,int sequence) {
            this.age = age;
            this.name = name;
            this.sequence = sequence;
        }
    }


    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int peopleCount = Integer.parseInt(bufferedReader.readLine());

        List<Person> people = new ArrayList<>();

        for (int i = 0; i < peopleCount; i++) {
            String[] line = bufferedReader.readLine().split(" ");
            Person person = new Person(Integer.parseInt(line[0]), line[1], i);
            people.add(person);
        }

        people.sort((o1, o2) -> {
            if (o1.age < o2.age) {
                return -1;
            } else if (o1.age > o2.age) {
                return 1;
            } else {
                return Integer.compare(o1.sequence, o2.sequence);
            }
        });

        StringBuilder result = new StringBuilder();
        people.forEach(person -> result.append(person.age).append(" ").append(person.name).append("\n"));
        System.out.println(result);
    }
}
