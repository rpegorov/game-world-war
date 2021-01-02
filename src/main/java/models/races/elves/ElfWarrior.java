package models.races.elves;

import models.Action;
import models.Unit;

import java.util.List;

public class ElfWarrior extends Unit {

    public ElfWarrior() {
        actions = List.of(Action.MELEE_ATTACK);
        meleeDamage = 15.0f;
    }

    @Override
    public String getType() {
        return "Elf Warrior";
    }
}
