package ru.milovanov.Project2Boot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.milovanov.Project2Boot.models.Person;
import java.util.Optional;

public interface PeopleRepository extends JpaRepository<Person, Integer> {
    Optional<Person> getPersonByFullName(String fullName);
}
