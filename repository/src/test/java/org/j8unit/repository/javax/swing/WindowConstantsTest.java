package org.j8unit.repository.javax.swing;

import javax.swing.WindowConstants;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link WindowConstants} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.swing.WindowConstantsTests}).
 */
@RunWith(J8Unit4.class)
public class WindowConstantsTest
implements WindowConstantsTests<WindowConstants> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.WindowConstants]

    @Override
    public WindowConstants createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.WindowConstants], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.WindowConstants]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.WindowConstants]

}
