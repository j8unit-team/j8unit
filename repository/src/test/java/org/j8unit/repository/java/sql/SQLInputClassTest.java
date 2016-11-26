package org.j8unit.repository.java.sql;

import java.sql.SQLInput;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link SQLInput} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.sql.SQLInputClassTests}).
 */
@RunWith(J8Unit4.class)
public class SQLInputClassTest
implements SQLInputClassTests<SQLInput> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.sql.SQLInput]

    @Override
    public Class<SQLInput> createNewSUT() {
        return SQLInput.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.sql.SQLInput]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.sql.SQLInput]

}
