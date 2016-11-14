package org.j8unit.repository.java.awt.image;

import java.awt.image.RescaleOp;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link RescaleOp} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.awt.image.RescaleOpTests}).
 */

@RunWith(J8Unit4.class)
public class RescaleOpTest
implements RescaleOpTests<RescaleOp> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.image.RescaleOp]

    @Override
    public RescaleOp createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.awt.image.RescaleOp], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.image.RescaleOp]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.image.RescaleOp]

}
