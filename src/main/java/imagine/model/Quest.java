package imagine.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.apache.catalina.LifecycleState;

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
public class Quest {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "quest_id")
    private Long id;
    @ManyToOne
    @JoinColumn(name = "unit_id")
    private Unit unit;
    @ManyToOne
    @JoinColumn(name = "hero_id")
    private Hero hero;
    @Enumerated(value = EnumType.STRING)
    private QuestType questType;
    private String questName;
    private String description;
    private int requiredLvl;
    private int requiredCount;
    @OneToMany(mappedBy = "quest")
    private List<Action> requiredActions;
    @OneToMany(mappedBy = "quest")
    private List<Monster> requiredMonsters;
    @OneToMany(mappedBy = "quest")
    private List<Item> requiredItems;
    @OneToMany(mappedBy = "quest")
    private List<Quest> requiredQuest;
    @ManyToOne
    private Quest quest;
    @OneToOne(mappedBy = "quest")
    private Bag bag;
    private boolean isDone;
    private boolean isActive;

}
