package models.races.orcs;

import models.Action;
import models.Unit;

import java.util.List;

public class OrcMage extends Unit {

    public OrcMage() {
        actions = List.of(Action.BUFF, Action.SPELL_DAMAGE);
        buff = Unit::getBuff;
        debuff = Unit::setDeBuff;
    }

    @Override
    public String getType() {
        return "Orc Mage";
    }
}
