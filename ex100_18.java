import java.util.Scanner;

public class ex100_18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 영문자 한 개를 입력받습니다.
        String input = scanner.nextLine();

        // 입력받은 문자의 첫 번째 문자를 가져와서 아스키 코드로 변환합니다.
        if (input.length() == 1) {
            char character = input.charAt(0);
            int asciiValue = (int) character;
            System.out.println(asciiValue);
        } else {
            System.out.println("한 글자만 입력하세요.");
        }
    }
}
