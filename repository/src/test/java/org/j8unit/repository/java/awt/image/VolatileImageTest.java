package org.j8unit.repository.java.awt.image;

import java.awt.image.VolatileImage;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link VolatileImage} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.awt.image.VolatileImageTests}).
 */
@RunWith(J8Unit4.class)
public class VolatileImageTest
implements VolatileImageTests<VolatileImage> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.image.VolatileImage]

    @Override
    public VolatileImage createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.awt.image.VolatileImage], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.image.VolatileImage]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.image.VolatileImage]

}
