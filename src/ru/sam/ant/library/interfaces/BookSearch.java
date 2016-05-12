package ru.sam.ant.library.interfaces;

import ru.sam.ant.library.objects.Author;
import ru.sam.ant.library.objects.Book;
import ru.sam.ant.library.objects.Genre;

import java.util.List;

public interface BookSearch {

    List<Book> getBooks();
    List<Book> getBooks(Author author);
    List<Book> getBooks(String name);
    List<Book> getBooks(Genre genre);
    List<Book> getBooks(Character letter);

}
