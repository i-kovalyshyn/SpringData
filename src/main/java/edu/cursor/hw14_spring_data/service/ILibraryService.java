package edu.cursor.hw14_spring_data.service;

import edu.cursor.hw14_spring_data.model.Author;
import edu.cursor.hw14_spring_data.model.Book;

import java.util.List;

public interface ILibraryService {
    void addAuthor (Author author);

    void deleteAuthorById(int id);

    void addBook(Book book);

    void deleteBookById(int id);

    List<Book> sortBookByAuthor(int authorId);

    List<Book> sortBookByGenre (String genre);

    Book updateBook(Book book);

    Author updateAuthor(Author author);

    List<Author> findAllAuthors();

    List<Book> findAllBooks();

}
