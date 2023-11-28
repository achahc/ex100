import java.util.Scanner;

public class ex100_19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 10진수 하나를 입력받습니다.
        int decimalValue = scanner.nextInt();

        // 입력된 10진수에 해당하는 아스키 문자를 출력합니다.
        if (decimalValue >= 0 && decimalValue <= 255) {
            char asciiChar = (char) decimalValue;
            System.out.println(asciiChar);
        } else {
            System.out.println("입력 범위를 벗어난 값입니다.");
        }
    }
}
