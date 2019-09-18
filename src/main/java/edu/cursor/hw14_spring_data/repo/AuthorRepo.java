package edu.cursor.hw14_spring_data.repo;

import edu.cursor.hw14_spring_data.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepo extends CrudRepository<Author, Integer> {
}
