package org.j8unit.repository.java.sql;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SQLClientInfoExceptionClassTest
implements org.j8unit.repository.java.sql.SQLClientInfoExceptionClassTests<java.sql.SQLClientInfoException> {

    @Override
    public Class<java.sql.SQLClientInfoException> createNewSUT() {
        return java.sql.SQLClientInfoException.class;
    }

}
