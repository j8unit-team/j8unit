package org.j8unit.repository.java.awt.image;

import java.awt.image.PixelInterleavedSampleModel;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link PixelInterleavedSampleModel} (by
 * simply reusing the J8Unit test interface
 * {@link org.j8unit.repository.java.awt.image.PixelInterleavedSampleModelTests}).
 */
@RunWith(J8Unit4.class)
public class PixelInterleavedSampleModelTest
implements PixelInterleavedSampleModelTests<PixelInterleavedSampleModel> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.image.PixelInterleavedSampleModel]

    @Override
    public PixelInterleavedSampleModel createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.awt.image.PixelInterleavedSampleModel], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.image.PixelInterleavedSampleModel]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.image.PixelInterleavedSampleModel]

}
