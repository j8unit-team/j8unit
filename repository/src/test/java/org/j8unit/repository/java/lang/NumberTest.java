package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Number} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.lang.NumberTests}).
 */

@RunWith(J8Unit4.class)
public class NumberTest
implements NumberTests<Number> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.lang.Number]

    @Override
    public Number createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.lang.Number], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.lang.Number]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.lang.Number]

}
