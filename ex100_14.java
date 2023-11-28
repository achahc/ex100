import java.util.Scanner;

public class ex100_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 시(hour)와 분(minute)을 입력받습니다.
        int hour = scanner.nextInt();
        int minute = scanner.nextInt();

        // 입력받은 시간을 "시:분" 형식으로 출력합니다.
        System.out.printf("%d:%d\n", hour, minute);
    }

}
