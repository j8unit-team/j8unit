package org.j8unit.repository.java.sql;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SQLSyntaxErrorExceptionTest
implements org.j8unit.repository.java.sql.SQLSyntaxErrorExceptionTests<java.sql.SQLSyntaxErrorException> {

    @Override
    public java.sql.SQLSyntaxErrorException createNewSUT() {
        return new java.sql.SQLSyntaxErrorException();
    }

}
