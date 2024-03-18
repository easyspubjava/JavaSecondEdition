package thread;

class MyThead extends Thread{


    public void run(){
        int i;
        for(i=0; i<=200; i++) {
            System.out.print(Thread.currentThread().getName() + ":" + i + "\t");
        }
    }
}

public class ThreadTest {

    public static void main(String[] args) {

        System.out.println(Thread.currentThread());

        MyThead thread1 = new MyThead();
        thread1.start();
        MyThead thread2 = new MyThead();
        thread2.start();

        System.out.println("end");
    }
}
