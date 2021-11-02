package imagine.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import imagine.model.Item;

public interface ItemRepository extends JpaRepository<Item, Long> {
    Item findByItemName(String itemName);

    List<Item> findByItemNameIn(List<String> itemNames);

}
