package chapter3;

public class Q14 {
    public static void main(String[] args) {
        int n = 5;
        int bitwiseNotN = ~n;

        System.out.println("원래 값: " + n);
        System.out.println("비트를 반대로 뒤집은 값: " + bitwiseNotN);
        System.out.println("이진수로 표현한 원래 값: " + Integer.toBinaryString(n));
        System.out.println("이진수로 표현한 뒤집은 값: " + Integer.toBinaryString(bitwiseNotN));
    }
}
