package models.races.undeads;

import models.Action;
import models.Unit;

import java.util.List;

public class UndeadMage extends Unit {

    public UndeadMage() {
        actions = List.of(Action.BUFF, Action.SPELL_DAMAGE);
        magicDamage = 5.0f;
        buff = Unit::getBuff;
        debuff = Unit::setDeBuff;
    }

    @Override
    public String getType() {
        return "Undead Mage";
    }
}
