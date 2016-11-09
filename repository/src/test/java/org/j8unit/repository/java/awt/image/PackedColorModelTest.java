package org.j8unit.repository.java.awt.image;

import java.awt.image.PackedColorModel;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link PackedColorModel} (by simply reusing
 * the J8Unit test interface {@link PackedColorModelTests}).
 */

@RunWith(J8Unit4.class)
public class PackedColorModelTest
implements PackedColorModelTests<PackedColorModel> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.image.PackedColorModel]

    @Override
    public PackedColorModel createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.awt.image.PackedColorModel], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.image.PackedColorModel]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.image.PackedColorModel]

}
