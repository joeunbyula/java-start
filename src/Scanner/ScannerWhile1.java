package Scanner;

import java.util.Scanner;

public class ScannerWhile1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("문자열 입력 (exit는 종료) : ");
            String str = scanner.nextLine();
            System.out.println("입력한 문자열 :  " + str);
            if("exit".equals(str)) {
                System.out.println("프로그램 종료!");
                break;
            }
        }
    }
}
