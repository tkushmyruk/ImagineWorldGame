package imagine.service;

import java.util.List;

import imagine.model.Hero;

public interface HeroService {

    List<Hero> findAllCreatedHeroes();

    boolean createHero(String heroName, int healthPoints, int manaPoints, int defense, int attack,
        String description, int strength, int agility, int intelligence, int freeStatPoints);


}
