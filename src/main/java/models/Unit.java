package models;

import java.util.List;
import java.util.Random;
import java.util.function.Consumer;

public abstract class Unit {

    protected float health = 100.0f;
    protected float meleeDamage;
    protected float rangeDamage;
    protected float magicDamage;
    protected Consumer<Unit> buff;
    protected Consumer<Unit> debuff;
    protected List<Action> actions;

    private float multiplierRangeDamage = 1.0f;  // Мультипликатор дальней атаки
    private float multiplierMeleeDamage = 1.0f;  // Мультипликатор ближней атаки
    private float multiplierSpellDamage = 1.0f;  // Мультипликатор магической атаки

    public abstract String getType();

    public float getHealth() {
        return health;
    }

    public float getMeleeDamage() {
        return meleeDamage * multiplierMeleeDamage;
    }

    public float getRangeDamage() {
        return rangeDamage * multiplierRangeDamage;
    }

    public List<Action> getActions() {
        return actions;
    }

    public float getMultiplierRangeDamage() {
        return multiplierRangeDamage;
    }

    public float getMultiplierMeleeDamage() {
        return multiplierMeleeDamage;
    }

    public void setHealth(float health) {
        this.health = health;
    }

    public void setMeleeDamage(float meleeDamage) {
        this.meleeDamage = meleeDamage;
    }

    public void setRangeDamage(float rangeDamage) {
        this.rangeDamage = rangeDamage;
    }

    public void setActions(List<Action> actions) {
        this.actions = actions;
    }

    public void setMultiplierRangeDamage(float multiplierRangeDamage) {
        this.multiplierRangeDamage = multiplierRangeDamage;
    }

    public void setMultiplierMeleeDamage(float multiplierMeleeDamage) {
        this.multiplierMeleeDamage = multiplierMeleeDamage;
    }

    public float getMagicDamage() {
        return magicDamage * multiplierSpellDamage;
    }

    public void setMagicDamage(float magicDamage) {
        this.magicDamage = magicDamage;
    }

    public float getMultiplierSpellDamage() {
        return multiplierSpellDamage;
    }

    public void setMultiplierSpellDamage(float multiplierSpellDamage) {
        this.multiplierSpellDamage = multiplierSpellDamage;
    }

    public Consumer<Unit> getBuff() {
        return buff;
    }

    public void setBuff(Consumer<Unit> buff) {
        this.buff = buff;
    }

    public Consumer<Unit> getDebuff() {
        return debuff;
    }

    public void setDebuff(Consumer<Unit> debuff) {
        this.debuff = debuff;
    }

    public Action getRandomAction() {
        return actions.get(new Random().nextInt(actions.size()));
    }

    public void setPrivileged() {
        this.setMultiplierMeleeDamage(1.5f);
        this.setMultiplierRangeDamage(1.5f);
        this.setMultiplierSpellDamage(1.5f);
    }

    public void setDeBuff() {
        this.setMultiplierMeleeDamage(0.5f);
        this.setMultiplierRangeDamage(0.5f);
        this.setMultiplierMeleeDamage(0.5f);
    }
}
