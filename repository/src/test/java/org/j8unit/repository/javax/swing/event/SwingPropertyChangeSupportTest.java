package org.j8unit.repository.javax.swing.event;

import javax.swing.event.SwingPropertyChangeSupport;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link SwingPropertyChangeSupport} (by
 * simply reusing the J8Unit test interface
 * {@link org.j8unit.repository.javax.swing.event.SwingPropertyChangeSupportTests}).
 */

@RunWith(J8Unit4.class)
public class SwingPropertyChangeSupportTest
implements SwingPropertyChangeSupportTests<SwingPropertyChangeSupport> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.event.SwingPropertyChangeSupport]

    @Override
    public SwingPropertyChangeSupport createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.event.SwingPropertyChangeSupport], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.event.SwingPropertyChangeSupport]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.event.SwingPropertyChangeSupport]

}
