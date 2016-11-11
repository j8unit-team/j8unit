package org.j8unit.repository.java.sql;

import java.sql.PreparedStatement;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link PreparedStatement} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.sql.PreparedStatementClassTests}).
 */

@RunWith(J8Unit4.class)
public class PreparedStatementClassTest
implements PreparedStatementClassTests<PreparedStatement> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.sql.PreparedStatement]

    @Override
    public Class<PreparedStatement> createNewSUT() {
        return PreparedStatement.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.sql.PreparedStatement]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.sql.PreparedStatement]

}
