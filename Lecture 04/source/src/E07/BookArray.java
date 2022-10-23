package E07;

import java.util.Scanner;

class Book {
    String title, author;
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
}

public class BookArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Book[] books = new Book[2];

        String title, author;
        System.out.print("첫번째 책 제목을 입력하세요. : ");
        title = scanner.next();
        System.out.print("첫번째 책 저자를 입력하세요. : ");
        author = scanner.next();
        books[0] = new Book(title, author);

        System.out.print("두번째 책 제목을 입력하세요. : ");
        title = scanner.next();
        System.out.print("두번째 책 저자를 입력하세요. : ");
        author = scanner.next();
        books[1] = new Book(title, author);

        System.out.println("첫번재 책의 제목/저자 : " + books[0].title + "/" + books[0].author);
        System.out.println("두번재 책의 제목/저자 : " + books[1].title + "/" + books[1].author);
    }
}