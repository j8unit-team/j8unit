package org.j8unit.repository.java.sql;

import java.sql.Clob;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Clob} (by simply reusing the J8Unit
 * test interface {@link ClobTests}).
 */

@RunWith(J8Unit4.class)
public class ClobTest
implements ClobTests<Clob> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.sql.Clob]

    @Override
    public Clob createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.sql.Clob], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.sql.Clob]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.sql.Clob]

}
