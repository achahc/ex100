import java.util.Scanner;

public class ex100_22 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 두 정수 a와 b를 입력받습니다.
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        // a가 b보다 크면 1을 출력, 그렇지 않으면 0을 출력합니다.
        if (a > b) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
