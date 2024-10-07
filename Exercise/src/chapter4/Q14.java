package chapter4;

public class Q14 {
        public static void main(String[ ] args) {
            int dan;
            int times;
            for(dan = 3; dan <= 7; dan++) {
                for(times = 1; times <= 9; times++) {
                    System.out.println(dan + "X" + times + "=" + dan * times);
                }
                System.out.println( );		// 한 줄 띄워서 출력
            }
        }

}
