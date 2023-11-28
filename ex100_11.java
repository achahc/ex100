import java.util.Scanner;

public class ex100_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 두 개의 문자를 입력받습니다.
        char char1 = scanner.next().charAt(0);
        char char2 = scanner.next().charAt(0);

        // 입력받은 두 문자의 순서를 바꿔서 출력합니다.
        System.out.println(char2 + " " + char1);
    }
}

