package imagine.service;

import java.util.List;

import imagine.model.Quest;

public interface QuestService {
  List<Quest> findAllQuests();

  boolean createQuest(String questName, String description, int requiredLvl, String questType);
}
