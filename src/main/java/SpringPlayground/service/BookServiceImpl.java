package SpringPlayground.service;


import SpringPlayground.model.Book;
import SpringPlayground.repository.BookRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
public class BookServiceImpl implements BookService{
    private BookRepository bookRepository;


    @Override
    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    @Override
    public Book getOne(UUID id) {
        return bookRepository.findById(id).get();
    }
}
