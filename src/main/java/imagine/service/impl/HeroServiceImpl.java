package imagine.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import imagine.model.Hero;
import imagine.repository.HeroRepository;
import imagine.service.HeroService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class HeroServiceImpl implements HeroService {

    private final HeroRepository heroRepository;

    public List<Hero> findAllCreatedHeroes() {
        return heroRepository.findAll();
    }

    @Override
    public boolean createHero(String heroName, int healthPoints, int manaPoints, int defense, int attack,
        String description, int strength, int agility, int intelligence, int freeStatPoints) {
        return heroRepository.save(Hero.builder()
            .heroName(heroName)
            .healthPoints(healthPoints)
            .manaPoints(manaPoints)
            .defense(defense)
            .spellResist(0)
            .description(description)
            .strength(strength)
            .agility(agility)
            .intelligence(intelligence)
            .freeStatPoints(freeStatPoints)
            .lvl(1)
            .attack(attack)
            .build()) != null;
    }
}
