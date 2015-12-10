package org.j8unit.repository.java.sql;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class StatementClassTest
implements org.j8unit.repository.java.sql.StatementClassTests<java.sql.Statement> {

    @Override
    public Class<java.sql.Statement> createNewSUT() {
        return java.sql.Statement.class;
    }

}
