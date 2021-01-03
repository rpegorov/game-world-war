package service.game.impl;

import models.Action;
import models.Unit;
import service.factory.UnitFactory;
import service.factory.impl.ElvesUnitFactoryImpl;
import service.factory.impl.HumansUnitFactoryImpl;
import service.factory.impl.OrcsUnitFactoryImpl;
import service.factory.impl.UndeadsUnitFactoryImpl;
import service.game.GameService;
import service.logger.Logger;

import java.util.List;
import java.util.Random;

public class GameServiceImpl implements GameService {

    @Override
    public void startGame() {
        Logger.doLog("START GAME");

        UnitFactory<Unit> firstFactory = getRandomFactory();
        Logger.doLog("First party is: " + firstFactory.getName());

        UnitFactory<Unit> secondFactory = getRandomFactory();
        Logger.doLog("First party is: " + secondFactory.getName());

        processGame(
                firstFactory.getParty(),
                "1: " + firstFactory.getName(),
                secondFactory.getParty(),
                "2: " + secondFactory.getName());
    }

    private void processGame(List<Unit> firstParty, String firstPartyName, List<Unit> secondParty, String secondPartyName) {
        int randInt = new Random().nextInt(2);
        while(!isGameOver(firstParty, secondParty)) {
            Logger.doLog(
                    firstPartyName + " SIZE IS: " + firstParty.size()
                            + " || "
                            + secondPartyName + " SIZE IS: " + secondParty.size());
            boolean isFirst = randInt % 2 == 0;
            List<Unit> actual = isFirst ? firstParty : secondParty;
            List<Unit> enemies = isFirst ? secondParty : firstParty;
            unitTurn(getRandomUnit(actual), enemies, actual);
            ++randInt;
        }

        Logger.doLog("END GAME! WON: " + (firstParty.isEmpty() ? secondPartyName : firstPartyName));
    }

    private void unitTurn(Unit unit, List<Unit> enemies, List<Unit> allies) {
        Logger.doLog(unit.getType() + " START TURN");
        Action action = unit.getRandomAction();
        doAction(unit, action, Action.BUFF.equals(action) ? allies : enemies);
        doAction(unit, action, Action.DEBUFF.equals(action) ? enemies : allies);
    }

    private boolean isGameOver(List<Unit> firstParty, List<Unit> secondParty) {
        return firstParty.isEmpty() || secondParty.isEmpty();
    }

    private Unit getRandomUnit(List<Unit> units) {
        return units.get(new Random().nextInt(units.size()));
    }

    private void doAction(Unit unit, Action action, List<Unit> targets) {
        int randIndex = new Random().nextInt(targets.size());
        Unit target = targets.get(randIndex);
        Logger.doLog(unit.getType() + " USE ACTION: " + action + " ON: " + target.getType());
        action.getDoAction().accept(target, unit);
        Logger.doLog(target.getType() + " NOW HAVE HP: " + target.getHealth());
        if (target.getHealth() <= 0.0f) {
            Logger.doLog(target.getType() + " IS DEAD NOW");
            targets.remove(randIndex);
        }
    }

    private UnitFactory<Unit> getRandomFactory() {
        return Factory.getRandom();
    }

    private enum Factory {
        ELVES(new ElvesUnitFactoryImpl()),
        HUMANS(new HumansUnitFactoryImpl()),
        ORCS(new OrcsUnitFactoryImpl()),
        UNDEADS(new UndeadsUnitFactoryImpl());

        private final UnitFactory<Unit> factory;

        Factory(UnitFactory<Unit> factory) {
            this.factory = factory;
        }

        private static UnitFactory<Unit> getRandom() {
            Factory[] factories = values();
            int randIndex = new Random().nextInt(values().length);
            return factories[randIndex].factory;
        }
    }
}
