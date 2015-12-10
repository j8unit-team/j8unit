package org.j8unit.repository.java.sql;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SQLClientInfoExceptionTest
implements org.j8unit.repository.java.sql.SQLClientInfoExceptionTests<java.sql.SQLClientInfoException> {

    @Override
    public java.sql.SQLClientInfoException createNewSUT() {
        return new java.sql.SQLClientInfoException();
    }

}
