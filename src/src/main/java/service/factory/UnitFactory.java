package service.factory;

import java.util.List;

public interface UnitFactory<T> {

    List<T> getParty();

    String getName();
}
