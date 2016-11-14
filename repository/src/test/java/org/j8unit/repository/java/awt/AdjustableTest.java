package org.j8unit.repository.java.awt;

import java.awt.Adjustable;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Adjustable} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.awt.AdjustableTests}).
 */

@RunWith(J8Unit4.class)
public class AdjustableTest
implements AdjustableTests<Adjustable> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.Adjustable]

    @Override
    public Adjustable createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.awt.Adjustable], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.Adjustable]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.Adjustable]

}
