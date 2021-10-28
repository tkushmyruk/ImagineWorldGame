package imagine.service;

import java.util.List;

import imagine.model.Skill;

public interface SkillService {
    List<Skill> findAllSkills();

    boolean createSkill(String skillName, String description, int damage, int periodicCount, int periodicDamage,
        int lvl, int minHeroLvl, int manaCost, String skillType, String damageType);

}
