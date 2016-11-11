package org.j8unit.repository.java.awt.image;

import java.awt.image.RasterOp;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link RasterOp} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.awt.image.RasterOpClassTests}).
 */

@RunWith(J8Unit4.class)
public class RasterOpClassTest
implements RasterOpClassTests<RasterOp> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.image.RasterOp]

    @Override
    public Class<RasterOp> createNewSUT() {
        return RasterOp.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.image.RasterOp]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.image.RasterOp]

}
