package org.j8unit.repository.javax.sql;

import javax.sql.ConnectionPoolDataSource;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ConnectionPoolDataSource} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.javax.sql.ConnectionPoolDataSourceClassTests}).
 */
@RunWith(J8Unit4.class)
public class ConnectionPoolDataSourceClassTest
implements ConnectionPoolDataSourceClassTests<ConnectionPoolDataSource> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.sql.ConnectionPoolDataSource]

    @Override
    public Class<ConnectionPoolDataSource> createNewSUT() {
        return ConnectionPoolDataSource.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.sql.ConnectionPoolDataSource]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.sql.ConnectionPoolDataSource]

}
