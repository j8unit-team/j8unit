package org.j8unit.repository.java.sql;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SQLTransientConnectionExceptionTest
implements org.j8unit.repository.java.sql.SQLTransientConnectionExceptionTests<java.sql.SQLTransientConnectionException> {

    @Override
    public java.sql.SQLTransientConnectionException createNewSUT() {
        return new java.sql.SQLTransientConnectionException();
    }

}
