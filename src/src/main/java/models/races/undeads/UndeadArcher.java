package models.races.undeads;

import models.Action;
import models.Unit;

import java.util.List;

public class UndeadArcher extends Unit {

    public UndeadArcher() {
        actions = List.of(Action.MELEE_ATTACK, Action.RANGE_ATTACK);
        meleeDamage = 2.0f;
        rangeDamage = 4.0f;
    }

    @Override
    public String getType() {
        return "Undead Archer";
    }
}
