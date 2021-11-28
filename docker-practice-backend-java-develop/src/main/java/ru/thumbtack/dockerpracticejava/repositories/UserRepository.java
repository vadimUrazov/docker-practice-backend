package ru.thumbtack.dockerpracticejava.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.thumbtack.dockerpracticejava.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
}
