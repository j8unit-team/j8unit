package org.j8unit.repository.java.awt.image;

import java.awt.image.WritableRaster;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link WritableRaster} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.awt.image.WritableRasterClassTests}).
 */

@RunWith(J8Unit4.class)
public class WritableRasterClassTest
implements WritableRasterClassTests<WritableRaster> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.image.WritableRaster]

    @Override
    public Class<WritableRaster> createNewSUT() {
        return WritableRaster.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.image.WritableRaster]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.image.WritableRaster]

}
