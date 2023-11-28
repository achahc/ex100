import java.util.Scanner;

public class ex100_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 년, 월, 일을 각각 입력받습니다.
        int year = scanner.nextInt();
        int month = scanner.nextInt();
        int day = scanner.nextInt();

        // 입력받은 값을 형식에 맞게 출력합니다.
        System.out.printf("%04d.%02d.%02d\n", year, month, day);
    }
}
