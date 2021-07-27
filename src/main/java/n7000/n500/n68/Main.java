package n7000.n500.n68;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 덩치 - 7568
 *
 * @author Gumin Jeong
 * @see <a href="https://www.acmicpc.net/problem/7568">문제 출처</a>
 * @since 2021-07-27
 */
public class Main {

     static class Person {
         int height;
         int weight;
         int rank;

        public Person(int height, int weight) {
            this.height = height;
            this.weight = weight;
            this.rank = 1;
        }

        public int getHeight() {
            return height;
        }

        public int getWeight() {
            return weight;
        }

        public int getRank() {
            return rank;
        }

         public void rankDown() {
             this.rank++;
         }

        public SizeComparisonResult getSizeComparisonResult(Person person) {
            if (this.height > person.getHeight() && this.weight > person.getWeight()) {
                return SizeComparisonResult.BIGGER;
            } else if (this.height < person.getHeight() && this.weight < person.getWeight()) {
                return SizeComparisonResult.SMALLER;
            } else {
                return SizeComparisonResult.INCOMPARABLE;
            }
        }

        enum SizeComparisonResult {
            BIGGER,
            INCOMPARABLE,
            SMALLER
        }

    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int peopleCount = scanner.nextInt();

        List<Person> people = new ArrayList<>();
        for (int i = 0; i < peopleCount; i++) {
            int height = scanner.nextInt();
            int weight = scanner.nextInt();

            Person person = new Person(height, weight);

            people.forEach(person1 -> {
                Person.SizeComparisonResult sizeComparisonResult = person.getSizeComparisonResult(person1);

                switch (sizeComparisonResult) {
                    case BIGGER:
                        person1.rankDown();
                        break;
                    case SMALLER:
                        person.rankDown();
                        break;
                    case INCOMPARABLE:
                        break;
                }
            });

            people.add(person);
        }

        StringBuilder result= new StringBuilder();
        for (Person person : people) {
            result.append(person.getRank()).append(" ");
        }
        System.out.println(result.substring(0, result.length() - 1));
    }
}
