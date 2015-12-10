package org.j8unit.repository.java.sql;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SQLSyntaxErrorExceptionClassTest
implements org.j8unit.repository.java.sql.SQLSyntaxErrorExceptionClassTests<java.sql.SQLSyntaxErrorException> {

    @Override
    public Class<java.sql.SQLSyntaxErrorException> createNewSUT() {
        return java.sql.SQLSyntaxErrorException.class;
    }

}
