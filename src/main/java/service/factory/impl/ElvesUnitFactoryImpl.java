package service.factory.impl;

import models.Unit;
import models.races.elves.ElfArcher;
import models.races.elves.ElfMage;
import models.races.elves.ElfWarrior;
import service.factory.UnitFactory;

import java.util.ArrayList;
import java.util.List;

public class ElvesUnitFactoryImpl implements UnitFactory<Unit> {

    @Override
    public List<Unit> getParty() {
        List<Unit> result = new ArrayList<>();
        result.add(new ElfMage());
        result.add(new ElfArcher());
        result.add(new ElfArcher());
        result.add(new ElfArcher());
        result.add(new ElfWarrior());
        result.add(new ElfWarrior());
        result.add(new ElfWarrior());
        result.add(new ElfWarrior());
        return result;
    }

    @Override
    public String getName() {
        return "Elves";
    }
}
