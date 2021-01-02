package models.races.humans;

import models.Action;
import models.Unit;

import java.util.List;

public class HumanWarrior extends Unit {

    public HumanWarrior() {
        actions = List.of(Action.MELEE_ATTACK);
        meleeDamage = 18.0f;
    }

    @Override
    public String getType() {
        return "Human Warrior";
    }
}
