package org.j8unit.repository.java.sql;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SQLNonTransientExceptionTest
implements org.j8unit.repository.java.sql.SQLNonTransientExceptionTests<java.sql.SQLNonTransientException> {

    @Override
    public java.sql.SQLNonTransientException createNewSUT() {
        return new java.sql.SQLNonTransientException();
    }

}
