package imagine.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import imagine.model.Hero;

public interface HeroRepository extends JpaRepository<Hero, Long> {

}
