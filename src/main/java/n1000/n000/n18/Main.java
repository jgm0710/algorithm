package n1000.n000.n18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * 체스판 다시 칠하기 - 1018
 *
 * @author Gumin Jeong
 * @see <a href="https://www.acmicpc.net/problem/1018">문제 출처</a>
 * @since 2021-08-02
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] squareSize = bufferedReader.readLine().split(" ");
        int width = Integer.parseInt(squareSize[0]);
        int height = Integer.parseInt(squareSize[1]);


        String[][] blackStartChessBoard = createChessBoard(true);
        String[][] whiteStartChessBoard = createChessBoard(false);
        String[][] inputChessBoard = new String[width][height];


        for (int i = 0; i < width; i++) {
            String[] lines = bufferedReader.readLine().split("");
            for (int j = 0; j < lines.length; j++) {
                inputChessBoard[i][j] = lines[j];
            }
        }
        bufferedReader.close();

        int lastStartWidthIndex = width - 8;
        int lastStartHeightIndex = height - 8;

        List<Integer> differentCounts = new ArrayList<>();

        for (int startWidthIndex = 0; startWidthIndex <= lastStartWidthIndex; startWidthIndex++) {
            for (int startHeightIndex = 0; startHeightIndex <= lastStartHeightIndex; startHeightIndex++) {

                int blackDifferentCount = 0;
                int whiteDifferentCount = 0;

                for (int k = startWidthIndex; k < startWidthIndex + 8; k++) {
                    for (int l = startHeightIndex; l < startHeightIndex + 8; l++) {

                        if (!whiteStartChessBoard[k - startWidthIndex][l - startHeightIndex].equals(inputChessBoard[k][l])) {
                            whiteDifferentCount++;
                        }
                        if (!blackStartChessBoard[k - startWidthIndex][l - startHeightIndex].equals(inputChessBoard[k][l])) {
                            blackDifferentCount++;
                        }
                    }
                }

                differentCounts.add(whiteDifferentCount);
                differentCounts.add(blackDifferentCount);
            }
        }

        differentCounts.sort(Comparator.naturalOrder());

        System.out.println(differentCounts.stream().findFirst().get());
    }

    private static String[][] createChessBoard(boolean isBlackStart) {
        String boardStartColor;
        String remainingColor;
        if (isBlackStart) {
            boardStartColor = "B";
            remainingColor = "W";
        } else {
            boardStartColor = "W";
            remainingColor = "B";
        }

        String[][] chessBoard = new String[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if ((i + j) % 2 == 0) {
                    chessBoard[i][j] = boardStartColor;
                } else {
                    chessBoard[i][j] = remainingColor;
                }
            }
        }
        return chessBoard;
    }
}
