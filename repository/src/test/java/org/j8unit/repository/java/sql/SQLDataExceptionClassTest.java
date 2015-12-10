package org.j8unit.repository.java.sql;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SQLDataExceptionClassTest
implements org.j8unit.repository.java.sql.SQLDataExceptionClassTests<java.sql.SQLDataException> {

    @Override
    public Class<java.sql.SQLDataException> createNewSUT() {
        return java.sql.SQLDataException.class;
    }

}
