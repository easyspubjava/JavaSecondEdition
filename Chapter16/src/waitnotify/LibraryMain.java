package waitnotify;

import java.util.ArrayList;

class Library{

    private ArrayList<String> shelf = new ArrayList<>();

    public Library() {
        shelf.add("태백산맥 1");
        shelf.add("태백산맥 2");
        shelf.add("태백산맥 3");
    }

    public synchronized  String lendBook() throws InterruptedException {

        Thread t = Thread.currentThread();
        while( shelf.size() == 0) {

            System.out.println(t.getName() + " waiting start");
            wait();
            System.out.println(t.getName() + " waiting end");
        }
        String book = shelf.remove(0);
        System.out.println(t.getName() + ":" +  book +  " lend");
        return book;
    }

    public synchronized  void returnBook(String book) {
        Thread t = Thread.currentThread();
        shelf.add(book);
        notifyAll();
        System.out.println(t.getName() + ": " + book + " return");
    }
}

class Student extends Thread{

    public void run() {

        try {
            String title = LibraryMain.library.lendBook();
            Thread.sleep(5000);
            LibraryMain.library.returnBook(title);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}

public class LibraryMain {

    public static Library library = new Library();

    public static void main(String[] args) {

        Student std1 = new Student();
        Student std2 = new Student();
        Student std3 = new Student();
        Student std4 = new Student();
        Student std5 = new Student();
        Student std6 = new Student();
        Student std7 = new Student();
        Student std8 = new Student();

        std1.start();
        std2.start();
        std3.start();
        std4.start();
        std5.start();
        std6.start();
        std7.start();
        std8.start();
    }
}