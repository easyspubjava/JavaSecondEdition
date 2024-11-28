package chapter4;

import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수를 입력하세요: ");
        int n = scanner.nextInt(); // 사용자로부터 정수 입력 받기

        if (n < 0) {
            System.out.println("팩토리얼은 음수에 대해 정의되지 않습니다.");
        } else {
            long factorial = calculateFactorial(n); // 팩토리얼 계산
            System.out.println(n + "의 팩토리얼은 " + factorial + "입니다.");
        }

        scanner.close(); // 스캐너 닫기
    }

    // 팩토리얼 계산 메서드
    private static long calculateFactorial(int n) {
        long result = 1; // 결과 저장 변수
        for (int i = 1; i <= n; i++) {
            result *= i; // 결과에 i를 곱함
        }
        return result;
    }

}
