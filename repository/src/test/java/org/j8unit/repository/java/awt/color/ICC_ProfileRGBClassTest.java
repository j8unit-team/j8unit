package org.j8unit.repository.java.awt.color;

import java.awt.color.ICC_ProfileRGB;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ICC_ProfileRGB} (by simply reusing the
 * J8Unit test interface {@link ICC_ProfileRGBClassTests}).
 */

@RunWith(J8Unit4.class)
public class ICC_ProfileRGBClassTest
implements ICC_ProfileRGBClassTests<ICC_ProfileRGB> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.color.ICC_ProfileRGB]

    @Override
    public Class<ICC_ProfileRGB> createNewSUT() {
        return ICC_ProfileRGB.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.color.ICC_ProfileRGB]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.color.ICC_ProfileRGB]

}
