package org.j8unit.repository.java.sql;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SQLTransientExceptionClassTest
implements org.j8unit.repository.java.sql.SQLTransientExceptionClassTests<java.sql.SQLTransientException> {

    @Override
    public Class<java.sql.SQLTransientException> createNewSUT() {
        return java.sql.SQLTransientException.class;
    }

}
