package chapter4;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("팩토리얼 계산할 숫자를 입력하세요 : ");
        int n = scanner.nextInt();

        System.out.printf("%d 팩토리얼은 %d입니다. %n", n, factorial(n));
        scanner.close();
    }

    // 팩토리얼을 계산하는 메서드
    public static long factorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
