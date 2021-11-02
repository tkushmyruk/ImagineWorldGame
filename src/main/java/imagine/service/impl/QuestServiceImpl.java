package imagine.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import imagine.model.Quest;
import imagine.model.QuestType;
import imagine.repository.QuestRepository;
import imagine.service.QuestService;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class QuestServiceImpl implements QuestService {

    private final QuestRepository questRepository;

    @Override
    public List<Quest> findAllQuests() {
        return questRepository.findAll();
    }

    @Override
    public boolean createQuest(String questName, String description, int requiredLvl, String questType) {

        return questRepository.save(Quest.builder()
            .questName(questName)
            .description(description)
            .requiredLvl(requiredLvl)
            .questType(QuestType.valueOf(questType))
            .build()) != null;
    }
}
