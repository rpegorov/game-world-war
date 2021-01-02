package service.factory.impl;

import models.Unit;
import models.races.humans.HumanArcher;
import models.races.humans.HumanMage;
import models.races.humans.HumanWarrior;
import service.factory.UnitFactory;

import java.util.ArrayList;
import java.util.List;

public class HumansUnitFactoryImpl implements UnitFactory<Unit> {

    @Override
    public List<Unit> getParty() {
        List<Unit> result = new ArrayList<>();
        result.add(new HumanMage());
        result.add(new HumanArcher());
        result.add(new HumanArcher());
        result.add(new HumanArcher());
        result.add(new HumanWarrior());
        result.add(new HumanWarrior());
        result.add(new HumanWarrior());
        result.add(new HumanWarrior());
        return result;
    }

    @Override
    public String getName() {
        return "Humans";
    }
}
