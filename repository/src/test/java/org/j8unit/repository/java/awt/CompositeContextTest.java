package org.j8unit.repository.java.awt;

import java.awt.CompositeContext;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link CompositeContext} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.awt.CompositeContextTests}).
 */
@RunWith(J8Unit4.class)
public class CompositeContextTest
implements CompositeContextTests<CompositeContext> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.CompositeContext]

    @Override
    public CompositeContext createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.awt.CompositeContext], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.CompositeContext]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.CompositeContext]

}
