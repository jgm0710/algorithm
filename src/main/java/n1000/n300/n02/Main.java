package n1000.n300.n02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * 베스트셀러 - 1302
 *
 * @author Gumin Jeong
 * @see <a href="https://www.acmicpc.net/problem/1302">문제 출처</a>
 * @since 2021-07-31
 */
public class Main {

    static class BookSale {
        String bookName;
        int soldCount;

        public BookSale(String bookName, int soldCount) {
            this.bookName = bookName;
            this.soldCount = soldCount;
        }
    }


    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int booksCount = Integer.parseInt(bufferedReader.readLine());

        List<BookSale> bookSales = new ArrayList<>();

        for (int i = 0; i < booksCount; i++) {
            String bookName = bufferedReader.readLine();
            Optional<BookSale> first = bookSales.stream().filter(bookSale -> bookSale.bookName.equals(bookName)).findFirst();

            if (first.isPresent()) {
                BookSale bookSale = first.get();
                bookSale.soldCount++;
            } else {
                bookSales.add(new BookSale(bookName, 1));
            }
        }

        bookSales.sort((o1, o2) -> {
            if (o1.soldCount > o2.soldCount) {
                return -1;
            } else if (o1.soldCount < o2.soldCount) {
                return 1;
            } else {
                return o1.bookName.compareTo(o2.bookName);
            }
        });

        System.out.println(bookSales.stream().findFirst().get().bookName);
    }
}
