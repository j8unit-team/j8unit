package org.j8unit.repository.java.awt;

import java.awt.Transparency;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Transparency} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.awt.TransparencyTests}).
 */
@RunWith(J8Unit4.class)
public class TransparencyTest
implements TransparencyTests<Transparency> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.Transparency]

    @Override
    public Transparency createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.awt.Transparency], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.Transparency]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.Transparency]

}
