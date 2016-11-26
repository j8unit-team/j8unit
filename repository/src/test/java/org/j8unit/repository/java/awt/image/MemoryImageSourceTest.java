package org.j8unit.repository.java.awt.image;

import java.awt.image.MemoryImageSource;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link MemoryImageSource} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.awt.image.MemoryImageSourceTests}).
 */
@RunWith(J8Unit4.class)
public class MemoryImageSourceTest
implements MemoryImageSourceTests<MemoryImageSource> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.image.MemoryImageSource]

    @Override
    public MemoryImageSource createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.awt.image.MemoryImageSource], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.image.MemoryImageSource]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.image.MemoryImageSource]

}
