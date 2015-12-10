package org.j8unit.repository.javax.sql;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class XAConnectionClassTest
implements org.j8unit.repository.javax.sql.XAConnectionClassTests<javax.sql.XAConnection> {

    @Override
    public Class<javax.sql.XAConnection> createNewSUT() {
        return javax.sql.XAConnection.class;
    }

}
