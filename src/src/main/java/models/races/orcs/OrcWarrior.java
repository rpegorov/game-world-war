package models.races.orcs;

import models.Action;
import models.Unit;

import java.util.List;

public class OrcWarrior extends Unit {

    public OrcWarrior() {
        actions = List.of(Action.MELEE_ATTACK);
        meleeDamage = 20.0f;
    }

    @Override
    public String getType() {
        return "Orc Warrior";
    }
}
