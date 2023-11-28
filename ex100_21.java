import java.util.Scanner;

public class ex100_21 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 두 정수 a와 b를 입력받습니다.
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        // a에 2의 b승을 곱한 결과를 계산하고 출력합니다.
        int result = a * (int) Math.pow(2, b);
        System.out.println(result);
    }

}
