package edu.cursor.hw14_spring_data.service;

import edu.cursor.hw14_spring_data.model.Author;
import edu.cursor.hw14_spring_data.model.Book;
import edu.cursor.hw14_spring_data.repo.AuthorRepo;
import edu.cursor.hw14_spring_data.repo.BookRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class LibraryService implements ILibraryService {
    private final AuthorRepo authorRepo;
    private final BookRepo bookRepo;

    @Override
    public void addAuthor(Author author) {
        authorRepo.save(author);

    }

    @Override
    public void deleteAuthorById(int id) {
        authorRepo.deleteById(id);

    }

    @Override
    public void addBook(Book book) {
        bookRepo.save(book);

    }

    @Override
    public void deleteBookById(int id) {
        bookRepo.deleteById(id);

    }

    @Override
    public List<Book> sortBookByAuthor(int authorId) {
        return bookRepo.findBookByAuthorId(authorId);
    }

    @Override
    public List<Book> sortBookByGenre(String genre) {
        return bookRepo.findBookByGenre(genre);
    }

    @Override
    public Book updateBook(Book book) {
        return bookRepo.save(book);
    }

    @Override
    public Author updateAuthor(Author author) {
        return authorRepo.save(author);
    }

    @Override
    public List<Author> findAllAuthors() {
        return (List<Author>) authorRepo.findAll();
    }

    @Override
    public List<Book> findAllBooks() {
        return (List<Book>) bookRepo.findAll();
    }
}
