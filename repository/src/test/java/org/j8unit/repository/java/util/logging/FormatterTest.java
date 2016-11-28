package org.j8unit.repository.java.util.logging;

import java.util.logging.Formatter;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Formatter} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.util.logging.FormatterTests}).
 */
@RunWith(J8Unit4.class)
public class FormatterTest
implements FormatterTests<Formatter> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.logging.Formatter]

    @Override
    public Formatter createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.logging.Formatter], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.logging.Formatter]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.logging.Formatter]

}
