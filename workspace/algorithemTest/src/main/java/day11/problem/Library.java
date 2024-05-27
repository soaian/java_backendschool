package day11.problem;

import java.util.*;

class Book implements Comparable<Book>{
    private String bookTitle;
    private String writer;
    private int year;

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public Book(String bookTitle, String writer, int year) {
        this.bookTitle = bookTitle;
        this.writer = writer;
        this.year = year;

    }
    @Override
    public int compareTo(Book o) {
        return this.year - o.year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(bookTitle, book.bookTitle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookTitle);
    }

    @Override
    public String toString() {
        return "[book title : " + bookTitle + ", " +
                "writer : " + writer + ", " +
                "year : " + year + "]";
    }


}

class BookManager {
    private List<Book> books = new ArrayList<>();


    public void addBook(Book book) {
        String title = book.getBookTitle();

        if (books.contains(book)) {
            System.out.println("이미 존재하는 책입니다.");
        } else {
            System.out.println("추가한 도서 : "+ book);
            books.add(book);
        }
    }

    public void displayBooks() {
        for (Book book2 : books){
            System.out.println(book2);
        }
    }

    public void sortBooksByYear() {
       Collections.sort(books);
        System.out.println("책을 연도 기준으로 정렬합니다");
        System.out.println(books);
    }
}
public class Library {
    public static void main(String[] args) {
        BookManager manager = new BookManager();
        manager.addBook(new Book("모두의 자바", "강경미", 2015));
        manager.addBook(new Book("이거이 자바다", "신용권", 2018));
        manager.addBook(new Book("자바의 정석", "남궁성", 2013)); // 중복 추가 시도
        manager.addBook(new Book("자바의 정석", "남궁성", 2013));

        System.out.println("=================");
        manager.displayBooks();
        System.out.println("=================");
        manager.sortBooksByYear();
    }
}
