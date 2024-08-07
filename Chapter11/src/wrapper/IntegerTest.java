package wrapper;

public class IntegerTest {
    public static void main(String[] args) {
        Integer num = 100;
        int iNum = num.intValue();
        int jNum = 200;

        int sum = iNum + jNum;
        System.out.println(sum);

        int total = num + jNum;
        System.out.println(total);

        Integer i = jNum;
        System.out.println(i);

        Object object = new Object();
    }
}
