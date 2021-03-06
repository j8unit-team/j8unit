package org.j8unit.repository.java.awt.image;

import java.awt.image.DataBufferFloat;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link DataBufferFloat} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.awt.image.DataBufferFloatTests}).
 */
@RunWith(J8Unit4.class)
public class DataBufferFloatTest
implements DataBufferFloatTests<DataBufferFloat> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.image.DataBufferFloat]

    @Override
    public DataBufferFloat createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.awt.image.DataBufferFloat], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.image.DataBufferFloat]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.image.DataBufferFloat]

}
