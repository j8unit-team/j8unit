package org.j8unit.repository.java.sql;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SQLDataExceptionTest
implements org.j8unit.repository.java.sql.SQLDataExceptionTests<java.sql.SQLDataException> {

    @Override
    public java.sql.SQLDataException createNewSUT() {
        return new java.sql.SQLDataException();
    }

}
