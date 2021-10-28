package imagine.service;

import java.util.List;

import imagine.model.Item;

public interface ItemService {

    List<Item> findAllItems();

    boolean addItem(String itemName, String description, int lvl, int minHeroLvl, int damage, int defense,
        int healthPoint, int manaPoint, int strength, int agility, int intelligence, int requiredStrength,
        int requiredAgility, int requiredIntelligence, String itemType, String itemRarity);

}
