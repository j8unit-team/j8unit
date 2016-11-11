package org.j8unit.repository.java.awt.image;

import java.awt.image.AreaAveragingScaleFilter;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link AreaAveragingScaleFilter} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.java.awt.image.AreaAveragingScaleFilterTests}).
 */

@RunWith(J8Unit4.class)
public class AreaAveragingScaleFilterTest
implements AreaAveragingScaleFilterTests<AreaAveragingScaleFilter> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.image.AreaAveragingScaleFilter]

    @Override
    public AreaAveragingScaleFilter createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.awt.image.AreaAveragingScaleFilter], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.image.AreaAveragingScaleFilter]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.image.AreaAveragingScaleFilter]

}
