package imagine.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import imagine.model.Skill;

public interface SkillRepository extends JpaRepository<Skill, Long> {

}
