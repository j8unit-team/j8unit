package org.j8unit.repository.java.sql;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SQLTimeoutExceptionTest
implements org.j8unit.repository.java.sql.SQLTimeoutExceptionTests<java.sql.SQLTimeoutException> {

    @Override
    public java.sql.SQLTimeoutException createNewSUT() {
        return new java.sql.SQLTimeoutException();
    }

}
