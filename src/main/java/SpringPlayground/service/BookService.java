package SpringPlayground.service;

import SpringPlayground.model.Book;

import java.util.List;
import java.util.UUID;

public interface BookService {
    public List<Book> findAll();

    Book getOne(UUID id);

    Book save(Book book);

    List<Book> findByName(String name);
}
