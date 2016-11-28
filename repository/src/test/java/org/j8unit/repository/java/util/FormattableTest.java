package org.j8unit.repository.java.util;

import java.util.Formattable;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Formattable} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.util.FormattableTests}).
 */
@RunWith(J8Unit4.class)
public class FormattableTest
implements FormattableTests<Formattable> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.Formattable]

    @Override
    public Formattable createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.Formattable], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.Formattable]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.Formattable]

}
