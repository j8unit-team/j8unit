package org.j8unit.repository.java.sql;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SQLNonTransientConnectionExceptionTest
implements org.j8unit.repository.java.sql.SQLNonTransientConnectionExceptionTests<java.sql.SQLNonTransientConnectionException> {

    @Override
    public java.sql.SQLNonTransientConnectionException createNewSUT() {
        return new java.sql.SQLNonTransientConnectionException();
    }

}
