package imagine.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import imagine.model.Quest;

public interface QuestRepository extends JpaRepository<Quest, Long> {

    List<Quest> findByQuestNameIn(List<String> questNames);

}
