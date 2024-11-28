package chapter4;

import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자를 입력하세요 :");
        int n = scanner.nextInt();
        System.out.println("1부터 " + n + " 사이의 소수는");

        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        scanner.close();
        System.out.println("입니다 ");
    }

    // 소수를 판별하는 메서드
    public static boolean isPrime(int num) {
        if (num <= 1) return false; // 1은 소수가 아님
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // 나누어 떨어지면 소수가 아님
            }
        }
        return true; // 나누어 떨어지지 않으면 소수
    }
}

