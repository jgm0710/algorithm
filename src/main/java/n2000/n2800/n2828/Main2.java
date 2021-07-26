package n2000.n2800.n2828;

import java.util.Scanner;

/**
 * 성능 향상을 위해 다시 구현
 * -> 코드 길이는 줄였으나 처리 속도는 줄이지 못함
 * -> InputStreamReader 를 통해 값을 한 번에 읽어드리면 속도 향상을 이룰 수 있는 것으로 보임
 *
 * @author Gumin Jeong
 * @since 2021-07-27
 */
public class Main2 {

    public static void main(String[] args) {

        int totalMovePoint = 0;

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int basketSize = scanner.nextInt();
        int applesCount = scanner.nextInt();

        int basketStartPoint = 1;
        int basketEndPoint = basketSize;


        for (int i = 0; i < applesCount; i++) {
            int fallingPoint = scanner.nextInt();

            if (fallingPoint < basketStartPoint) {
                int movePoint = basketStartPoint - fallingPoint;
                totalMovePoint += movePoint;
                basketStartPoint -= movePoint;
                basketEndPoint -= movePoint;
            } else if (basketEndPoint < fallingPoint) {
                int movePoint = fallingPoint - basketEndPoint;
                totalMovePoint += movePoint;
                basketStartPoint += movePoint;
                basketEndPoint += movePoint;
            } else {
                continue;
            }
        }

        System.out.println(totalMovePoint);
    }
}
