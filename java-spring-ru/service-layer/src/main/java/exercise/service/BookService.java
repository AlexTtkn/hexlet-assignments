package exercise.service;

import exercise.dto.*;
import exercise.exception.ResourceNotFoundException;
import exercise.mapper.BookMapper;
import exercise.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    // BEGIN
    @Autowired
    private BookRepository repository;

    @Autowired BookMapper mapper;

    public List<BookDTO> getAllBooks() {
        return repository.findAll().stream()
                .map(mapper::map)
                .toList();
    }

    public BookDTO create(BookCreateDTO data) {
        var book = mapper.map(data);
        repository.save(book);
        return mapper.map(book);
    }

    public BookDTO findById(Long id) {
        var book = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Not Found: " + id));

        return mapper.map(book);
    }

    public BookDTO update(Long id, BookUpdateDTO data) {
        var book = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Not Found: " + id));
        mapper.update(data, book);
        repository.save(book);
        return mapper.map(book);
    }
    public void delete(Long id) {
        repository.deleteById(id);
    }
    // END
}
