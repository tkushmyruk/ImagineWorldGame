package imagine.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import imagine.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);

}
