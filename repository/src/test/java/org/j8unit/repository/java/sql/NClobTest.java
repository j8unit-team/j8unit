package org.j8unit.repository.java.sql;

import java.sql.NClob;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link NClob} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.sql.NClobTests}).
 */

@RunWith(J8Unit4.class)
public class NClobTest
implements NClobTests<NClob> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.sql.NClob]

    @Override
    public NClob createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.sql.NClob], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.sql.NClob]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.sql.NClob]

}
