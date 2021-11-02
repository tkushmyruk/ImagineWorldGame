package imagine.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import imagine.model.DamageType;
import imagine.model.ItemRarity;
import imagine.model.ItemType;
import imagine.model.MonsterType;
import imagine.model.SkillType;
import imagine.service.HeroService;
import imagine.service.ItemService;
import imagine.service.MonsterService;
import imagine.service.SkillService;
import imagine.service.UnitService;
import imagine.util.Constants;
import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
public class GameEditorController {

    private final HeroService heroService;
    private final SkillService skillService;
    private final ItemService itemService;
    private final UnitService unitService;
    private final MonsterService monsterService;

    @GetMapping("/editor")
    public String getListOfOptions(Model model) {
        model.addAttribute("options", Constants.optionsNames);
        return "optionList";
    }

    @GetMapping("/editor/hero")
    public String getHeroEditorPage(Model model) {
        model.addAttribute("heroes", heroService.findAllCreatedHeroes());
        return "heroEditorPage";
    }

    @GetMapping("/editor/skill")
    public String getSkillEditorPage(Model model) {
        model.addAttribute("skills", skillService.findAllSkills());
        model.addAttribute("skillTypes", SkillType.values());
        model.addAttribute("damageTypes", DamageType.values());
        return "skillEditorPage";
    }

    @GetMapping("/editor/item")
    public String getItemEditorPage(Model model) {
        model.addAttribute("items", itemService.findAllItems());
        model.addAttribute("itemTypes", ItemType.values());
        model.addAttribute("itemRarities", ItemRarity.values());
        return "itemEditorPage";
    }

    @GetMapping("/editor/unit")
    public String getUnitEditorPage(Model model) {
        model.addAttribute("units", unitService.findAllUnits());
        return "unitEditorPage";
      
    @GetMapping("/editor/monster")
    public String getMonsterEditorPage(Model model){
        model.addAttribute("monsters", monsterService.findAllMonsters());
        model.addAttribute("monsterTypes", MonsterType.values());
        return "monsterEditorPage";
    }

    @PostMapping("/editor/hero")
    public String createHero(@RequestParam String heroName,
        @RequestParam int healthPoints,
        @RequestParam int manaPoints,
        @RequestParam int defense,
        @RequestParam int attack,
        @RequestParam String description,
        @RequestParam int strength,
        @RequestParam int agility,
        @RequestParam int intelligence,
        @RequestParam int freeStatPoints,
        Model model) {
        heroService.createHero(heroName, healthPoints, manaPoints, defense, attack, description,
            strength, agility, intelligence, freeStatPoints);
        model.addAttribute("heroes", heroService.findAllCreatedHeroes());
        return "heroEditorPage";
    }

    @PostMapping("editor/skill")
    public String createSkill(@RequestParam String skillName,
        @RequestParam String description,
        @RequestParam int damage,
        @RequestParam int periodicCount,
        @RequestParam int periodicDamage,
        @RequestParam int manaCost,
        @RequestParam int lvl,
        @RequestParam int minHeroLvl,
        @RequestParam String skillType,
        @RequestParam String damageType,
        Model model) {
        skillService.createSkill(skillName, description, damage, periodicCount, periodicDamage, lvl, minHeroLvl,
            manaCost, skillType, damageType);
        model.addAttribute("skills", skillService.findAllSkills());
        model.addAttribute("skillTypes", SkillType.values());
        model.addAttribute("damageTypes", DamageType.values());
        return "skillEditorPage";
    }

    @PostMapping("/editor/item")
    public String createItem(@RequestParam String itemName,
        @RequestParam String description,
        @RequestParam int lvl,
        @RequestParam int minHeroLvl,
        @RequestParam int damage,
        @RequestParam int defense,
        @RequestParam int healthPoints,
        @RequestParam int manaPoints,
        @RequestParam int strength,
        @RequestParam int agility,
        @RequestParam int intelligence,
        @RequestParam int requiredStrength,
        @RequestParam int requiredAgility,
        @RequestParam int requiredIntelligence,
        @RequestParam String itemType,
        @RequestParam String itemRarity,
        Model model) {
        itemService.addItem(itemName, description, lvl, minHeroLvl, damage, defense, healthPoints, manaPoints, strength,
            agility, intelligence, requiredStrength, requiredAgility, requiredIntelligence, itemType, itemRarity);
        model.addAttribute("items", itemService.findAllItems());
        model.addAttribute("itemTypes", ItemType.values());
        model.addAttribute("itemRarities", ItemRarity.values());
        return "itemEditorPage";
    }

    @PostMapping("/editor/unit")
    public String createUnit(@RequestParam String name,
        @RequestParam String description,
        Model model) {
        unitService.createUnit(name, description);
        model.addAttribute("units", unitService.findAllUnits());
        return "unitEditorPage";
    }


    @PostMapping("/editor/monster")
    public String createMonster(@RequestParam String monsterName,
        @RequestParam String description,
        @RequestParam int lvl,
        @RequestParam int damage,
        @RequestParam int defense,
        @RequestParam int healthPoints,
        @RequestParam int manaPoints,
        @RequestParam int experience,
        @RequestParam String monsterType,
        Model model){
        monsterService.createMonster(monsterName, description, lvl, damage, defense, healthPoints,
            manaPoints, experience, monsterType);
        model.addAttribute("monsters", monsterService.findAllMonsters());
        model.addAttribute("monsterTypes", MonsterType.values());
        return "monsterEditorPage";
    }


}
