package org.j8unit.repository.javax.sql;

import javax.sql.PooledConnection;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PooledConnectionClassTest
implements org.j8unit.repository.javax.sql.PooledConnectionClassTests<PooledConnection> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.sql.PooledConnection]

    @Override
    public Class<PooledConnection> createNewSUT() {
        return PooledConnection.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.sql.PooledConnection]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.sql.PooledConnection]

}
