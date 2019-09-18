package edu.cursor.hw14_spring_data.repo;

import edu.cursor.hw14_spring_data.model.Book;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BookRepo extends CrudRepository<Book, Integer> {
    List<Book> findBookByGenre(String genre);
    List<Book> findBookByAuthorId(int id);

}
