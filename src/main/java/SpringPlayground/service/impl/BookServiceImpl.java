package SpringPlayground.service.impl;


import SpringPlayground.model.Book;
import SpringPlayground.repository.BookRepository;
import SpringPlayground.service.BookService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
public class BookServiceImpl implements BookService {
    private BookRepository bookRepository;


    @Override
    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    @Override
    public Book getOne(UUID id) {
        return bookRepository.findById(id).get();
    }

    @Override
    public Book save(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public List<Book> findByName(String name) {
        return bookRepository.findByBookNameContaining(name);
    }
}
