package edu.cursor.hw14_spring_data.controller;


import edu.cursor.hw14_spring_data.model.Author;
import edu.cursor.hw14_spring_data.service.ILibraryService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
public class AuthorController {

    private ILibraryService iLibraryService;

    @ResponseBody
    @PostMapping("/author")
    public ResponseEntity<Author> addAuthor(@RequestBody Author author) {
        iLibraryService.addAuthor(author);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @ResponseBody
    @DeleteMapping("/author/{id}")
    public void deleteAuthor(@PathVariable("id") int authorId) {
        iLibraryService.deleteAuthorById(authorId);
    }

    @ResponseBody
    @PatchMapping("author/{id}")
    public Author updateAuthor(@RequestBody Author author) {
        return iLibraryService.updateAuthor(author);
    }

    @ResponseBody
    @GetMapping("/author")
    public List<Author> findAllAuthor(){
        return  iLibraryService.findAllAuthors();
    }
}
