package models.races.humans;

import models.Action;
import models.Unit;

import java.util.List;

public class HumanArcher extends Unit {

    public HumanArcher() {
        actions = List.of(Action.MELEE_ATTACK, Action.RANGE_ATTACK);
        meleeDamage = 3.0f;
        rangeDamage = 5.0f;
    }

    @Override
    public String getType() {
        return "Human Archer";
    }
}
