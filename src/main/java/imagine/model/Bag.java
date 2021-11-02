package imagine.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
public class Bag {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "bag_id")
    private Long id;
    @OneToOne
    @JoinColumn(name = "hero_id")
    private Hero hero;
    @OneToOne
    @JoinColumn(name = "quest_id")
    private Quest quest;
    @OneToOne
    @JoinColumn(name = "monster_id")
    private Monster monster;
    @OneToMany(mappedBy = "bag")
    private List<Item> items;

}
