package org.j8unit.repository.java.awt.image;

import java.awt.image.RasterOp;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link RasterOp} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.awt.image.RasterOpTests}).
 */
@RunWith(J8Unit4.class)
public class RasterOpTest
implements RasterOpTests<RasterOp> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.image.RasterOp]

    @Override
    public RasterOp createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.awt.image.RasterOp], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.image.RasterOp]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.image.RasterOp]

}
