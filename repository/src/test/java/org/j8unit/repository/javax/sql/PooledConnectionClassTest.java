package org.j8unit.repository.javax.sql;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PooledConnectionClassTest
implements org.j8unit.repository.javax.sql.PooledConnectionClassTests<javax.sql.PooledConnection> {

    @Override
    public Class<javax.sql.PooledConnection> createNewSUT() {
        return javax.sql.PooledConnection.class;
    }

}
