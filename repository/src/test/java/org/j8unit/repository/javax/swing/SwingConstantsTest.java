package org.j8unit.repository.javax.swing;

import javax.swing.SwingConstants;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link SwingConstants} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.swing.SwingConstantsTests}).
 */
@RunWith(J8Unit4.class)
public class SwingConstantsTest
implements SwingConstantsTests<SwingConstants> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.SwingConstants]

    @Override
    public SwingConstants createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.SwingConstants], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.SwingConstants]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.SwingConstants]

}
