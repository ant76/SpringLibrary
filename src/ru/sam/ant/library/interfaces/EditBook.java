package ru.sam.ant.library.interfaces;

import ru.sam.ant.library.objects.Book;

public interface EditBook {

    boolean save(Book book);
    boolean delete(Book book);
    boolean edit(Book book);
    boolean add(Book book);
}
