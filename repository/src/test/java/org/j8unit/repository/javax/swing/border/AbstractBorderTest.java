package org.j8unit.repository.javax.swing.border;

import javax.swing.border.AbstractBorder;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link AbstractBorder} (by simply reusing
 * the J8Unit test interface {@link AbstractBorderTests}).
 */

@RunWith(J8Unit4.class)
public class AbstractBorderTest
implements AbstractBorderTests<AbstractBorder> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.border.AbstractBorder]

    @Override
    public AbstractBorder createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.border.AbstractBorder], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.border.AbstractBorder]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.border.AbstractBorder]

}
