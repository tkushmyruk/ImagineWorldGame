package imagine.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import imagine.model.DamageType;
import imagine.model.Skill;
import imagine.model.SkillType;
import imagine.repository.SkillRepository;
import imagine.service.SkillService;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class SkillServiceImpl implements SkillService {
    private SkillRepository skillRepository;

    @Override
    public List<Skill> findAllSkills() {
        return skillRepository.findAll();
    }

    @Override
    public boolean createSkill(String skillName, String description, int damage, int periodicCount, int periodicDamage,
        int lvl, int minHeroLvl, int manaCost, String skillType, String damageType) {
        return skillRepository.save(Skill.builder()
            .skillName(skillName)
            .description(description)
            .damage(damage)
            .periodicCount(periodicCount)
            .periodicDamage(periodicDamage)
            .lvl(lvl)
            .minHeroLvl(minHeroLvl)
            .manaCost(manaCost)
            .skillType(SkillType.valueOf(skillType))
            .damageType(DamageType.valueOf(damageType))
            .build()) != null;
    }
}
