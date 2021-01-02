package service.factory.impl;

import models.Unit;
import models.races.orcs.OrcArcher;
import models.races.orcs.OrcMage;
import models.races.orcs.OrcWarrior;
import service.factory.UnitFactory;

import java.util.ArrayList;
import java.util.List;

public class OrcsUnitFactoryImpl implements UnitFactory<Unit> {

    @Override
    public List<Unit> getParty() {
        List<Unit> result = new ArrayList<>();
        result.add(new OrcMage());
        result.add(new OrcArcher());
        result.add(new OrcArcher());
        result.add(new OrcArcher());
        result.add(new OrcWarrior());
        result.add(new OrcWarrior());
        result.add(new OrcWarrior());
        result.add(new OrcWarrior());
        return result;
    }

    @Override
    public String getName() {
        return "Orcs";
    }
}
