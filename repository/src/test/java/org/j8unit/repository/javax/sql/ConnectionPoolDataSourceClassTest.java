package org.j8unit.repository.javax.sql;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ConnectionPoolDataSourceClassTest
implements org.j8unit.repository.javax.sql.ConnectionPoolDataSourceClassTests<javax.sql.ConnectionPoolDataSource> {

    @Override
    public Class<javax.sql.ConnectionPoolDataSource> createNewSUT() {
        return javax.sql.ConnectionPoolDataSource.class;
    }

}
