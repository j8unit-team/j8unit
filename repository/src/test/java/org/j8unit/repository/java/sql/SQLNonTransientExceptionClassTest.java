package org.j8unit.repository.java.sql;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SQLNonTransientExceptionClassTest
implements org.j8unit.repository.java.sql.SQLNonTransientExceptionClassTests<java.sql.SQLNonTransientException> {

    @Override
    public Class<java.sql.SQLNonTransientException> createNewSUT() {
        return java.sql.SQLNonTransientException.class;
    }

}
