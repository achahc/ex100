import java.util.Scanner;

public class ex100_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 두 개의 정수를 입력받습니다.
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        // 입력받은 두 정수를 공백으로 구분하여 그대로 출력합니다.
        System.out.println(number1 + " " + number2);
    }
}
