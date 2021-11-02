package imagine.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import imagine.model.Monster;

public interface MonsterRepository extends JpaRepository<Monster, Long> {
}
