package org.j8unit.repository.java.awt.color;

import java.awt.color.ICC_ProfileGray;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ICC_ProfileGray} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.awt.color.ICC_ProfileGrayClassTests}).
 */
@RunWith(J8Unit4.class)
public class ICC_ProfileGrayClassTest
implements ICC_ProfileGrayClassTests<ICC_ProfileGray> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.color.ICC_ProfileGray]

    @Override
    public Class<ICC_ProfileGray> createNewSUT() {
        return ICC_ProfileGray.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.color.ICC_ProfileGray]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.color.ICC_ProfileGray]

}
