package Scanner;

import java.util.Scanner;

public class Scanner2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("첫번째 숫자 입력 : ");
        int firstValue = scanner.nextInt();
        System.out.print("두번째 숫자 입력 : ");
        int secondValue = scanner.nextInt();
        int result = firstValue+secondValue;
        System.out.println("두 수의 합은 ? " + result);
    }
}
