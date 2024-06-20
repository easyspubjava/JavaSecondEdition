package chapter7;


import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrixA = new int[3][3];
        int[][] matrixB = new int[3][3];
        int[][] resultMatrix = new int[3][3];

        // 첫 번째 행렬 입력
        System.out.println("Enter the elements of Matrix A (3x3):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrixA[i][j] = scanner.nextInt();
            }
        }

        // 두 번째 행렬 입력
        System.out.println("Enter the elements of Matrix B (3x3):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrixB[i][j] = scanner.nextInt();
            }
        }

        // 행렬 덧셈 수행
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                resultMatrix[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }

        // 결과 출력
        System.out.println("Result of Matrix Addition:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println(); // 새 줄로 이동
        }

        scanner.close();
    }
}
