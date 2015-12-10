package org.j8unit.repository.java.sql;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SQLInvalidAuthorizationSpecExceptionTest
implements org.j8unit.repository.java.sql.SQLInvalidAuthorizationSpecExceptionTests<java.sql.SQLInvalidAuthorizationSpecException> {

    @Override
    public java.sql.SQLInvalidAuthorizationSpecException createNewSUT() {
        return new java.sql.SQLInvalidAuthorizationSpecException();
    }

}
