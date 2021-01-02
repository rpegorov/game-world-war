package models.races.elves;

import models.Action;
import models.Unit;

import java.util.List;

public class ElfArcher extends Unit {

    public ElfArcher() {
        actions = List.of(Action.MELEE_ATTACK, Action.RANGE_ATTACK);
        meleeDamage = 3.0f;
        rangeDamage = 7.0f;
    }

    @Override
    public String getType() {
        return "Elf Archer";
    }
}
