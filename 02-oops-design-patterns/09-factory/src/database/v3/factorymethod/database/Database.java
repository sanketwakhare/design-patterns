package database.v3.factorymethod.database;

import database.v3.factorymethod.query.Query;

public interface Database {

    // factory method
    Query createQuery();
}
