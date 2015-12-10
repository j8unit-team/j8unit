package org.j8unit.repository.java.sql;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SQLTransientExceptionTest
implements org.j8unit.repository.java.sql.SQLTransientExceptionTests<java.sql.SQLTransientException> {

    @Override
    public java.sql.SQLTransientException createNewSUT() {
        return new java.sql.SQLTransientException();
    }

}
