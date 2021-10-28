package imagine.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import imagine.model.Item;
import imagine.model.ItemRarity;
import imagine.model.ItemType;
import imagine.repository.ItemRepository;
import imagine.service.ItemService;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ItemServiceImpl implements ItemService {

    private final ItemRepository itemRepository;

    @Override
    public List<Item> findAllItems() {
        return itemRepository.findAll();
    }

    @Override
    public boolean addItem(String itemName, String description, int lvl, int minHeroLvl, int damage, int defense, int healthPoint,
        int manaPoint, int strength, int agility, int intelligence, int requiredStrength, int requiredAgility,
        int requiredIntelligence, String itemType, String itemRarity) {
        return itemRepository.save(Item.builder()
            .itemName(itemName)
            .description(description)
            .lvl(lvl)
            .minHeroLvl(minHeroLvl)
            .damage(damage)
            .defense(defense)
            .healthPoint(healthPoint)
            .manaPoint(manaPoint)
            .strength(strength)
            .agility(agility)
            .intelligence(intelligence)
            .requiredStrength(requiredStrength)
            .requiredAgility(requiredAgility)
            .requiredIntelligence(requiredIntelligence)
            .itemType(ItemType.valueOf(itemType))
            .itemRarity(ItemRarity.valueOf(itemRarity)).build()) != null;
    }
}
