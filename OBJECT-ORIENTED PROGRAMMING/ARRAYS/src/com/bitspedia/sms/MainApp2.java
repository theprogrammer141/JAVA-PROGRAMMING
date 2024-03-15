package com.bitspedia.sms;

public class MainApp2 {
    public static void main(String[] args)
    {
        Book books[] = new Book[3];
        books[0] = new Book(1, "Intro to Java");
        books[1] = new Book(2, "Intro to C#");
        books[2] = new Book(3, "Intro to Software Construction");

        for(Book book : books)
        {
            System.out.println(book.getId());
            System.out.println(book.getTitle());
        }

    }
}
