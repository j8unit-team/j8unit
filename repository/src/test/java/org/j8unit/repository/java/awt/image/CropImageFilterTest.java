package org.j8unit.repository.java.awt.image;

import java.awt.image.CropImageFilter;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link CropImageFilter} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.awt.image.CropImageFilterTests}).
 */
@RunWith(J8Unit4.class)
public class CropImageFilterTest
implements CropImageFilterTests<CropImageFilter> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.image.CropImageFilter]

    @Override
    public CropImageFilter createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.awt.image.CropImageFilter], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.image.CropImageFilter]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.image.CropImageFilter]

}
