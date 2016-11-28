package org.j8unit.repository.java.sql;

import java.sql.SQLInput;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link SQLInput} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.sql.SQLInputTests}).
 */
@RunWith(J8Unit4.class)
public class SQLInputTest
implements SQLInputTests<SQLInput> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.sql.SQLInput]

    @Override
    public SQLInput createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.sql.SQLInput], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.sql.SQLInput]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.sql.SQLInput]

}
