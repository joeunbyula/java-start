package Scanner;

import java.util.Scanner;

public class Scanner3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("첫 번째 숫자 : ");
        int first = scanner.nextInt();

        System.out.print("두 번째 숫자 : ");
        int second = scanner.nextInt();

        if(first>second) {
            System.out.print("더 큰 숫자 : " + first);
        } else if(first<second) {
            System.out.print("더 큰 숫자 : " + second);
        } else {
            System.out.print("같다");
        }
    }
}
