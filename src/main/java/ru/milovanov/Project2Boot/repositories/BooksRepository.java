package ru.milovanov.Project2Boot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.milovanov.Project2Boot.models.Book;

import java.util.List;

public interface BooksRepository extends JpaRepository<Book, Integer> {
    List<Book> findByTitleIsStartingWith(String prefix);
}
