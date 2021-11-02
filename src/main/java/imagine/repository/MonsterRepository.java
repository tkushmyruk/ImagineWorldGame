package imagine.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import imagine.model.Monster;

public interface MonsterRepository extends JpaRepository<Monster, Long> {
    Monster findByMonsterName(String monsterName);

    List<Monster> findByMonsterNameIn(List<String> monsterNames);
}
