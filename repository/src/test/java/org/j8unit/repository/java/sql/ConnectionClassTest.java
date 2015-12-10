package org.j8unit.repository.java.sql;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ConnectionClassTest
implements org.j8unit.repository.java.sql.ConnectionClassTests<java.sql.Connection> {

    @Override
    public Class<java.sql.Connection> createNewSUT() {
        return java.sql.Connection.class;
    }

}
