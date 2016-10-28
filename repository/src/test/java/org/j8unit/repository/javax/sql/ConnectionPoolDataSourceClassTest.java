package org.j8unit.repository.javax.sql;

import javax.sql.ConnectionPoolDataSource;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ConnectionPoolDataSourceClassTest
implements org.j8unit.repository.javax.sql.ConnectionPoolDataSourceClassTests<ConnectionPoolDataSource> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.sql.ConnectionPoolDataSource]

    @Override
    public Class<ConnectionPoolDataSource> createNewSUT() {
        return ConnectionPoolDataSource.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.sql.ConnectionPoolDataSource]

}
