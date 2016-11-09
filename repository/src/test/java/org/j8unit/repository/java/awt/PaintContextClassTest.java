package org.j8unit.repository.java.awt;

import java.awt.PaintContext;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link PaintContext} (by simply reusing the
 * J8Unit test interface {@link PaintContextClassTests}).
 */

@RunWith(J8Unit4.class)
public class PaintContextClassTest
implements PaintContextClassTests<PaintContext> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.PaintContext]

    @Override
    public Class<PaintContext> createNewSUT() {
        return PaintContext.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.PaintContext]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.PaintContext]

}
