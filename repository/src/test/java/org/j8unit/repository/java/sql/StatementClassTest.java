package org.j8unit.repository.java.sql;

import java.sql.Statement;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class StatementClassTest
implements org.j8unit.repository.java.sql.StatementClassTests<Statement> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.sql.Statement]

    @Override
    public Class<Statement> createNewSUT() {
        return Statement.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.sql.Statement]

}
