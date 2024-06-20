package chapter12;

import java.util.Optional;

class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}

public class Exercise8 {
    public static void main(String[] args) {
        // 책 객체를 Optional로 감싼다 (책이 없을 수도 있다고 가정)
        Optional<Book> optionalBook = Optional.ofNullable(null);

        // Optional 객체에서 제목 추출
        String title = optionalBook
                .map(Book::getTitle)
                .orElse("No book found");

        // 결과 출력
        System.out.println(title);

        // 책 객체가 실제로 있을 경우
        Optional<Book> anotherOptionalBook = Optional.of(new Book("태백산맥", "조정래"));

        // 다른 방식으로 Optional 객체에서 제목 추출
        anotherOptionalBook.ifPresent(book -> System.out.println(book.getTitle()));
    }
}