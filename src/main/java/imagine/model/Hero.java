package imagine.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
public class Hero {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "hero_id")
    private Long id;
    private String userHeroName;
    private String heroName;
    @Enumerated(EnumType.STRING)
    private HeroType heroType;
    private int healthPoints;
    private int manaPoints;
    private int defense;
    private int spellResist;
    private int attack;
    private String description;
    @OneToMany(mappedBy = "hero")
    private List<Skill> skills;
    @OneToMany(mappedBy = "hero")
    private List<Quest> quests;
    private int strength;
    private int agility;
    private int intelligence;
    private int lvl;
    private long experience;
    private int freeStatPoints;
    @OneToOne(mappedBy = "hero")
    private Bag heroBag;
    @OneToOne(mappedBy = "hero")
    private Equipment heroEquipment;

}
