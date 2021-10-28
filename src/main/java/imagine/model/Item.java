package imagine.model;

import javax.persistence.Column;
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
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "item_id")
    private Long id;
    private String itemName;
    private String description;
    private int lvl;
    private int minHeroLvl;
    private int damage;
    private int defense;
    private int healthPoint;
    private int manaPoint;
    private int strength;
    private int agility;
    private int intelligence;
    private int requiredStrength;
    private int requiredAgility;
    private int requiredIntelligence;
    @Enumerated(EnumType.STRING)
    private ItemType itemType;
    @Enumerated(EnumType.STRING)
    private ItemRarity itemRarity;
    @ManyToOne
    @JoinColumn(name = "bag_id")
    private Bag bag;


}
