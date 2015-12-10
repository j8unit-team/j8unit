package org.j8unit.repository.java.sql;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SQLExceptionTest
implements org.j8unit.repository.java.sql.SQLExceptionTests<java.sql.SQLException> {

    @Override
    public java.sql.SQLException createNewSUT() {
        return new java.sql.SQLException();
    }

}
