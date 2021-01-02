package models;

import java.util.function.BiConsumer;

public enum Action {
    MELEE_ATTACK((t, s) -> t.setHealth(t.getHealth() - s.getMeleeDamage())),
    RANGE_ATTACK((t, s) -> t.setHealth(t.getHealth() - s.getRangeDamage())),
    SPELL_DAMAGE((t, s) -> t.setHealth(t.getHealth() - s.getMagicDamage())),
    BUFF((t, s) -> s.getBuff().accept(t));

    private final BiConsumer<Unit, Unit> doAction;

    Action(BiConsumer<Unit, Unit> doAction) {
        this.doAction = doAction;
    }

    public BiConsumer<Unit, Unit> getDoAction() {
        return doAction;
    }
}
