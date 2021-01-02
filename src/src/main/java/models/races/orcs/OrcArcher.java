package models.races.orcs;

import models.Action;
import models.Unit;

import java.util.List;

public class OrcArcher extends Unit {

    public OrcArcher() {
        actions = List.of(Action.MELEE_ATTACK, Action.RANGE_ATTACK);
        meleeDamage = 2.0f;
        rangeDamage = 3.0f;
    }

    @Override
    public String getType() {
        return "Orc Archer";
    }
}
