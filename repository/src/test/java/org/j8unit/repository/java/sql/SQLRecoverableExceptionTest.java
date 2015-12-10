package org.j8unit.repository.java.sql;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SQLRecoverableExceptionTest
implements org.j8unit.repository.java.sql.SQLRecoverableExceptionTests<java.sql.SQLRecoverableException> {

    @Override
    public java.sql.SQLRecoverableException createNewSUT() {
        return new java.sql.SQLRecoverableException();
    }

}
