package org.j8unit.repository.java.time.temporal;

import java.time.temporal.JulianFields;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link JulianFields} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.time.temporal.JulianFieldsTests}).
 */
@RunWith(J8Unit4.class)
public class JulianFieldsTest
implements JulianFieldsTests<JulianFields> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.time.temporal.JulianFields]

    @Override
    public JulianFields createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.time.temporal.JulianFields], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.time.temporal.JulianFields]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.time.temporal.JulianFields]

}
