package org.j8unit.repository.javax.swing.text;

import javax.swing.text.DefaultTextUI;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link DefaultTextUI} (by simply reusing the
 * J8Unit test interface {@link DefaultTextUITests}).
 */

@RunWith(J8Unit4.class)
public class DefaultTextUITest
implements DefaultTextUITests<DefaultTextUI> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.DefaultTextUI]

    @Override
    public DefaultTextUI createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.text.DefaultTextUI], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.text.DefaultTextUI]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.text.DefaultTextUI]

}
