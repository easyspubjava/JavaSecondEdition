package chapter2;

public class ImplicitTest {
    public static void main(String[] args) {
        int iNum = 1000;
        byte bNum = (byte)iNum;

        System.out.println(iNum);
        System.out.println(bNum);

        double dNum = 3.14;
        int iNum2 = (int)dNum;
        System.out.println(dNum);
        System.out.println(iNum2);
    }
}
