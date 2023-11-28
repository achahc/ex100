import java.util.Scanner;

public class ex100_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 실수를 입력받습니다.
        float number = scanner.nextFloat();

        // 입력받은 실수를 소수점 이하 3번째 자리에서 반올림하여 2번째 자리까지 출력합니다.
        System.out.printf("%.2f\n", number);
    }

}
