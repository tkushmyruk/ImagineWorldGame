package imagine.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import imagine.model.Item;

public interface ItemRepository extends JpaRepository<Item, Long> {

}
