package models.races.humans;

import models.Action;
import models.Unit;

import java.util.List;

public class HumanMage extends Unit {

    public HumanMage() {
        actions = List.of(Action.BUFF, Action.SPELL_DAMAGE);
        magicDamage = 4.0f;
        buff = Unit::setPrivileged;
    }

    @Override
    public String getType() {
        return "Human Mage";
    }
}
