package ru.sam.ant.library.interfaces;

import ru.sam.ant.library.objects.Book;

public interface ShowBook {
    void showBook(Book book);
    void downloadBook(Book book);
    void voteBook(Book book);
}
