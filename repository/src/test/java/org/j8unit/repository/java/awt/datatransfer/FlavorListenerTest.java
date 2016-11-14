package org.j8unit.repository.java.awt.datatransfer;

import java.awt.datatransfer.FlavorListener;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link FlavorListener} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.awt.datatransfer.FlavorListenerTests}).
 */

@RunWith(J8Unit4.class)
public class FlavorListenerTest
implements FlavorListenerTests<FlavorListener> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.datatransfer.FlavorListener]

    @Override
    public FlavorListener createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.awt.datatransfer.FlavorListener], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.datatransfer.FlavorListener]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.datatransfer.FlavorListener]

}
