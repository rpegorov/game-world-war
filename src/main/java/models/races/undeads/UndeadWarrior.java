package models.races.undeads;

import models.Action;
import models.Unit;

import java.util.List;

public class UndeadWarrior extends Unit {

    public UndeadWarrior() {
        actions = List.of(Action.MELEE_ATTACK);
        meleeDamage = 18.0f;
    }

    @Override
    public String getType() {
        return "Undead Warrior";
    }
}
