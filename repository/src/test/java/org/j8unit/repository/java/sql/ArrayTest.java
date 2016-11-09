package org.j8unit.repository.java.sql;

import java.sql.Array;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Array} (by simply reusing the J8Unit
 * test interface {@link ArrayTests}).
 */

@RunWith(J8Unit4.class)
public class ArrayTest
implements ArrayTests<Array> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.sql.Array]

    @Override
    public Array createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.sql.Array], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.sql.Array]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.sql.Array]

}
