package org.j8unit.repository.java.sql;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SQLNonTransientConnectionExceptionClassTest
implements org.j8unit.repository.java.sql.SQLNonTransientConnectionExceptionClassTests<java.sql.SQLNonTransientConnectionException> {

    @Override
    public Class<java.sql.SQLNonTransientConnectionException> createNewSUT() {
        return java.sql.SQLNonTransientConnectionException.class;
    }

}
