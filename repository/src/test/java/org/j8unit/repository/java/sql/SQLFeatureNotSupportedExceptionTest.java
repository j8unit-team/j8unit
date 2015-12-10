package org.j8unit.repository.java.sql;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SQLFeatureNotSupportedExceptionTest
implements org.j8unit.repository.java.sql.SQLFeatureNotSupportedExceptionTests<java.sql.SQLFeatureNotSupportedException> {

    @Override
    public java.sql.SQLFeatureNotSupportedException createNewSUT() {
        return new java.sql.SQLFeatureNotSupportedException();
    }

}
