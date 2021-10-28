package imagine.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

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
public class Skill {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "hero_id")
    private Hero hero;
    @ManyToOne
    @JoinColumn(name = "monster_id")
    private Monster monster;
    private String skillName;
    private String description;
    @Enumerated(EnumType.STRING)
    private SkillType skillType;
    @Enumerated(EnumType.STRING)
    private DamageType damageType;
    private int damage;
    private int lvl;
    private int minHeroLvl;
    private int manaCost;
    private int periodicCount;
    private int periodicDamage;
}
