package org.j8unit.repository.java.sql;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SQLTransientConnectionExceptionClassTest
implements org.j8unit.repository.java.sql.SQLTransientConnectionExceptionClassTests<java.sql.SQLTransientConnectionException> {

    @Override
    public Class<java.sql.SQLTransientConnectionException> createNewSUT() {
        return java.sql.SQLTransientConnectionException.class;
    }

}
