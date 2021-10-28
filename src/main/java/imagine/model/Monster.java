package imagine.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Monster {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "monster_id")
    private Long id;
    @OneToMany(mappedBy = "monster")
    private List<Skill> skills;
}
