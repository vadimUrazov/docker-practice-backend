package ru.thumbtack.dockerpracticejava.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.thumbtack.dockerpracticejava.model.Session;

@Repository
public interface SessionRepository extends CrudRepository<Session, Long> {
}
