package org.j8unit.repository.java.awt;

import java.awt.PrintGraphics;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link PrintGraphics} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.awt.PrintGraphicsClassTests}).
 */
@RunWith(J8Unit4.class)
public class PrintGraphicsClassTest
implements PrintGraphicsClassTests<PrintGraphics> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.PrintGraphics]

    @Override
    public Class<PrintGraphics> createNewSUT() {
        return PrintGraphics.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.PrintGraphics]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.PrintGraphics]

}
