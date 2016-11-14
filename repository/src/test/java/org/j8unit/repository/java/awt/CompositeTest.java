package org.j8unit.repository.java.awt;

import java.awt.Composite;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Composite} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.awt.CompositeTests}).
 */

@RunWith(J8Unit4.class)
public class CompositeTest
implements CompositeTests<Composite> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.Composite]

    @Override
    public Composite createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.awt.Composite], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.Composite]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.Composite]

}
