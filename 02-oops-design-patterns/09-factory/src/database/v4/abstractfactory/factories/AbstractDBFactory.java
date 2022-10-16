package database.v4.abstractfactory.factories;

import database.v4.abstractfactory.database.Database;
import database.v4.abstractfactory.query.Query;

public interface AbstractDBFactory {
    Database createDatabase();

    Query createQuery();
}
