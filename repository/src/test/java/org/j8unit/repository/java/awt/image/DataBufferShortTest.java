package org.j8unit.repository.java.awt.image;

import java.awt.image.DataBufferShort;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link DataBufferShort} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.awt.image.DataBufferShortTests}).
 */

@RunWith(J8Unit4.class)
public class DataBufferShortTest
implements DataBufferShortTests<DataBufferShort> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.image.DataBufferShort]

    @Override
    public DataBufferShort createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.awt.image.DataBufferShort], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.image.DataBufferShort]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.image.DataBufferShort]

}
