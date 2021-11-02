package imagine.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import imagine.model.Unit;
import imagine.repository.UnitRepository;
import imagine.service.UnitService;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UnitServiceImpl implements UnitService {
    private final UnitRepository unitRepository;

    @Override
    public List<Unit> findAllUnits() {
        return unitRepository.findAll();
    }

    @Override
    public boolean createUnit(String name, String description) {
        return unitRepository.save(Unit.builder()
            .name(name)
            .description(description)
            .build()) != null;
    }
}
