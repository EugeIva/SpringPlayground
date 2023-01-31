package SpringPlayground.controller;


import SpringPlayground.model.Book;
import SpringPlayground.service.BookService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@AllArgsConstructor
@RestController
@RequestMapping("/books")
public class BookController {

    private BookService bookService;

    @GetMapping("/all")
    public List<Book> findAll() {
        return bookService.findAll();
    }

    @GetMapping
    public Book getOne(@RequestParam(name = "id", required = true) UUID id) {
        return bookService.getOne(id);
    }

    @PostMapping
    public Book save(@RequestBody Book book) {
        return bookService.save(book);
    }

    @GetMapping("/findByName")
    public List<Book> findByName(@RequestParam(name = "name", required = true) String name) {
        return bookService.findByName(name);
    }

}
