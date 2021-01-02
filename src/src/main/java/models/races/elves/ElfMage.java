package models.races.elves;

import models.Action;
import models.Unit;

import java.util.List;

public class ElfMage extends Unit {

    public ElfMage() {
        actions = List.of(Action.BUFF, Action.SPELL_DAMAGE);
        magicDamage = 10.0f;
        buff = Unit::setPrivileged;
    }

    @Override
    public String getType() {
        return "Elf Mage";
    }
}
