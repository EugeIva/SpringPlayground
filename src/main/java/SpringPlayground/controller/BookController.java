package SpringPlayground.controller;


import SpringPlayground.model.Book;
import SpringPlayground.service.BookService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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

}
