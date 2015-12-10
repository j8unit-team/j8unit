package org.j8unit.repository.java.sql;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SQLTimeoutExceptionClassTest
implements org.j8unit.repository.java.sql.SQLTimeoutExceptionClassTests<java.sql.SQLTimeoutException> {

    @Override
    public Class<java.sql.SQLTimeoutException> createNewSUT() {
        return java.sql.SQLTimeoutException.class;
    }

}
