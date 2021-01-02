package service.factory.impl;

import models.Unit;
import models.races.undeads.UndeadArcher;
import models.races.undeads.UndeadMage;
import models.races.undeads.UndeadWarrior;
import service.factory.UnitFactory;

import java.util.ArrayList;
import java.util.List;

public class UndeadsUnitFactoryImpl implements UnitFactory<Unit> {

    @Override
    public List<Unit> getParty() {
        List<Unit> result = new ArrayList<>();
        result.add(new UndeadMage());
        result.add(new UndeadArcher());
        result.add(new UndeadArcher());
        result.add(new UndeadArcher());
        result.add(new UndeadWarrior());
        result.add(new UndeadWarrior());
        result.add(new UndeadWarrior());
        result.add(new UndeadWarrior());
        return result;
    }

    @Override
    public String getName() {
        return "Undeads";
    }
}
