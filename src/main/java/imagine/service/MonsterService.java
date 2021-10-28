package imagine.service;

import java.util.List;

import imagine.model.Monster;

public interface MonsterService {
    List<Monster> findAllMonsters();

    boolean createMonster(String monsterName, String description, int lvl, int damage, int defense,
        int healthPoint, int manaPoint, int experience, String monsterType);

}
