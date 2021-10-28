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

@Entity
public class Bag {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "bag_id")
    private Long id;
    @OneToOne
    @JoinColumn(name = "hero_id")
    private Hero hero;
    @OneToMany(mappedBy = "bag")
    private List<Item> items;

}
