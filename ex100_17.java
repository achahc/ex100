import java.util.Scanner;

public class ex100_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 10진수 하나를 입력받습니다.
        int decimalValue = scanner.nextInt();

        // 입력받은 10진수를 16진수로 변환하여 출력합니다.
        String hexValue = Integer.toHexString(decimalValue).toUpperCase();
        System.out.println(hexValue);
    }
}
