package imagine.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import imagine.model.Action;

public interface ActionRepository extends JpaRepository<Action, Long> {

     Action findByActionName(String actionName);

     List<Action> findByActionNameIn(List<String> actionNames);
}
