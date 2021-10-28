package imagine.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import imagine.model.Monster;
import imagine.model.MonsterType;
import imagine.repository.MonsterRepository;
import imagine.service.MonsterService;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class MonsterServiceImpl implements MonsterService {
    private final MonsterRepository monsterRepository;

    @Override
    public List<Monster> findAllMonsters() {
        return monsterRepository.findAll();
    }

    @Override
    public boolean createMonster(String monsterName, String description, int lvl, int damage, int defense,
        int healthPoint, int manaPoint, int experience, String monsterType) {
        return monsterRepository.save(Monster.builder()
            .monsterName(monsterName)
            .description(description)
            .lvl(lvl)
            .damage(damage)
            .defense(defense)
            .healthPoints(healthPoint)
            .manaPoints(manaPoint)
            .experience(experience)
            .monsterType(MonsterType.valueOf(monsterType))
            .build()) != null;
    }
}
