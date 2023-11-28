import java.util.Scanner;

public class ex100_20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 정수 세 개를 입력받습니다.
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        // 입력받은 정수 세 개의 합을 계산합니다.
        int sum = num1 + num2 + num3;

        // 평균을 계산하고 소수점 이하 둘째 자리에서 반올림하여 첫째 자리까지 출력합니다.
        double average = (double) sum / 3;

        System.out.println("합: " + sum);
        System.out.printf("평균: %.1f\n", average);
    }
}
