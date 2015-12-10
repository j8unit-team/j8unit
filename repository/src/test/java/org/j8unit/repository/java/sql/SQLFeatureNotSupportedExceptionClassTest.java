package org.j8unit.repository.java.sql;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SQLFeatureNotSupportedExceptionClassTest
implements org.j8unit.repository.java.sql.SQLFeatureNotSupportedExceptionClassTests<java.sql.SQLFeatureNotSupportedException> {

    @Override
    public Class<java.sql.SQLFeatureNotSupportedException> createNewSUT() {
        return java.sql.SQLFeatureNotSupportedException.class;
    }

}
