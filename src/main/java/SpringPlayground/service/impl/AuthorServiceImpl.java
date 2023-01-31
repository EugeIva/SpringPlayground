package SpringPlayground.service.impl;

import SpringPlayground.model.Author;
import SpringPlayground.repository.AuthorRepository;
import SpringPlayground.service.AuthorService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class AuthorServiceImpl implements AuthorService {

    private AuthorRepository authorRepository;

    @Override
    public List<Author> findAll() {
        return authorRepository.findAll();
    }
}
