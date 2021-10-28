package imagine.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
public class Monster {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "monster_id")
    private Long id;
    private String monsterName;
    private String description;
    private int lvl;
    private int damage;
    private int defense;
    private int healthPoints;
    private int manaPoints;
    private int experience;
    @Enumerated(EnumType.STRING)
    private MonsterType monsterType;
    @OneToOne(mappedBy = "monster")
    private Bag bag;
    @OneToMany(mappedBy = "monster")
    private List<Skill> skills;
}
