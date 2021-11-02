package imagine.service;

import java.util.List;

import imagine.model.Unit;

public interface UnitService {

    List<Unit> findAllUnits();

    boolean createUnit(String name, String description);

}
