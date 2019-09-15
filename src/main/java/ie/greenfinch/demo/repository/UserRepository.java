package ie.greenfinch.demo.repository;

import org.springframework.data.repository.CrudRepository;
import ie.greenfinch.demo.models.User;

public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);
}
