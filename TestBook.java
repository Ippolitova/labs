package lab1.Test;

import lab1.Book;

public class TestBook {
    public static void main(String[] args) {
        Book b1 = new Book("Little prince", "Antoine de Saint-Exupery", 98);
        Book b2 = new Book("Flowers", "Daniel Kyes", 359);
        Book b3 = new Book("Code", "Charels p", 490);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }
}
