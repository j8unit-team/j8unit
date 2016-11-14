package org.j8unit.repository.java.sql;

import java.sql.Statement;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Statement} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.sql.StatementClassTests}).
 */

@RunWith(J8Unit4.class)
public class StatementClassTest
implements StatementClassTests<Statement> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.sql.Statement]

    @Override
    public Class<Statement> createNewSUT() {
        return Statement.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.sql.Statement]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.sql.Statement]

}
