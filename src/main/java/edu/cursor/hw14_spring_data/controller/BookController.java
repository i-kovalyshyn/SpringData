package edu.cursor.hw14_spring_data.controller;

import edu.cursor.hw14_spring_data.model.Book;
import edu.cursor.hw14_spring_data.service.ILibraryService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class BookController {

    private ILibraryService iLibraryService;

    @PostMapping("/addBook")
    public ResponseEntity addBook(@RequestBody Book book) {
        iLibraryService.addBook(book);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/{id}")
    public List<Book> sortedBookByAuthor(@PathVariable("id") int id) {
        return iLibraryService.sortBookByAuthor(id);
    }

    @ResponseBody
    @GetMapping("")
    public List<Book> sortedBookByGenre(@RequestParam(value = "genre") String genre) {
        return iLibraryService.sortBookByGenre(genre);
    }

    @DeleteMapping("/book/{id}")
    public void deleteBook(@PathVariable("id") int bookId){
        iLibraryService.deleteAuthorById(bookId);
    }

    @ResponseBody
    @PatchMapping("book/{id}")
    public Book updateBook(@RequestBody Book book){
        return iLibraryService.updateBook(book);
    }
}
